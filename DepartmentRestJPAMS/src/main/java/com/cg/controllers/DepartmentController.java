package com.cg.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.entities.Departments;
import com.cg.services.IDepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private IDepartmentService deservice;

	private static final Logger logger = LoggerFactory.getLogger(DepartmentController.class);

	private static final String LOCAL_SERVER_PORT = "local.server.port";

	@Autowired
	private Environment environment;


	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<String> getDepartmentPort() {
		return ResponseEntity.ok("Department Controller, Port: " + environment.getProperty(LOCAL_SERVER_PORT));
	}

	@GetMapping("/findAll")
	public List<String> findAllDepartment() {
		logger.info("************In finddepartment controller***********");
		return deservice.getAllDepartment();
	}

	@GetMapping("find/{deptId}")
	public Departments getDepartmentById(@PathVariable Integer deptId) {
		logger.info("************In getdepartment by id***********");

		return deservice.getDepartmentById(deptId);
	}

}
