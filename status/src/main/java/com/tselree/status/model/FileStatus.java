package com.tselree.status.model;

import java.sql.Date;

public class FileStatus {
	private Integer total_file;
	private Date file_transfer_date;
	private String file_transfer_status;
	
	public Integer getTotal_file() {
		return total_file;
	}
	public void setTotal_file(Integer total_file) {
		this.total_file = total_file;
	}
	public Date getFile_transfer_date() {
		return file_transfer_date;
	}
	public void setFile_transfer_date(Date file_transfer_date) {
		this.file_transfer_date = file_transfer_date;
	}
	public String getFile_transfer_status() {
		return file_transfer_status;
	}
	public void setFile_transfer_status(String file_transfer_status) {
		this.file_transfer_status = file_transfer_status;
	}
	
}
