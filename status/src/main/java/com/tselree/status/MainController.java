package com.tselree.status;

import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tselree.status.MainController;
import com.tselree.status.dao.StatusDAO;
import com.tselree.status.model.FileStatus;

@Controller
@RequestMapping(path="/status")
public class MainController {
	@Autowired
	private StatusDAO statusDAO;
	private static final Logger log = LoggerFactory.getLogger(MainController.class);
	
	@GetMapping(path="/getstatus")
	@ResponseBody
	public void getStatus() {
		log.info("Status Recived");
	}
	@PostMapping(path="/poststatus")
	@ResponseBody
	public void postStatus(@RequestBody FileStatus fileStatus) {
		log.info("Status Received");
		statusDAO.postStatus(fileStatus.getTotal_file(), fileStatus.getFile_transfer_date(), fileStatus.getFile_transfer_status());
	}
	
}
