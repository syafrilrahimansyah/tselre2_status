package com.tselree.status.dao;

import java.sql.Date;


public interface StatusDAO {
	public void postStatus(Integer totalFile, Date fileTransferDate, String fileTransferStatus);
}
