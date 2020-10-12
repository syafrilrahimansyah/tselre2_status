package com.tselree.status.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.tselree.status.dao.StatusDAO;
import com.tselree.status.dao.StatusDAOimpl;

@Configuration
@PropertySource({
        "file:src/main/resources/application.properties" 
})
public class AppConfig {
	@Autowired
    Environment env;
	
	@Bean()
    public DataSource getDataSource1() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("DB_DRIVER"));
        dataSource.setUrl(env.getProperty("DB_URL"));
        dataSource.setUsername(env.getProperty("DB_USERNAME"));
        dataSource.setPassword(env.getProperty("DB_PASSWORD"));
         
        return dataSource;
    }
	@Bean()
    public StatusDAO getStatusDAO() {
    	return new StatusDAOimpl(getDataSource1());
    }
}
