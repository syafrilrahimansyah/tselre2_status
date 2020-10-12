package com.tselree.status.dao;

import java.sql.Date;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StatusDAOimpl implements StatusDAO{
	JdbcTemplate jdbcTemplate;
	public StatusDAOimpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void postStatus(Integer totalFile, Date fileTransferDate, String fileTransferStatus) {
		String sql = "INSERT INTO public.extc_file_status(TOTAL_FILE, FILE_TRANSFER_DATE, FILE_TRANSFER_STATUS) VALUES("+totalFile+",'"+fileTransferDate+"','"+fileTransferStatus+"')";
		jdbcTemplate.update(sql);
	}

}
