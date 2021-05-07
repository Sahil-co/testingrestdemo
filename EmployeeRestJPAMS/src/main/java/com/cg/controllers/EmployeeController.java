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

import com.cg.entities.Employees;
import com.cg.services.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	private static final String LOCAL_SERVER_PORT = "local.server.port";

	@Autowired
	IEmployeeService empService;

	@Autowired
	private Environment environment;

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<String> getEmployeePort() {
		return ResponseEntity.ok("Employee Controller, Port: " + environment.getProperty(LOCAL_SERVER_PORT));
	}

	@RequestMapping(value="/getdeptfromemp",method = RequestMethod.GET)
	public ResponseEntity getDepts() {
		String depts = restTemplate.getForObject("http://localhost:9100/department/findAll", String.class);
		logger.info("Employee Controller, Port: "+environment.getProperty(LOCAL_SERVER_PORT));
		return ResponseEntity.ok("Retrieving depts from Employee Controller" + "" +environment.getProperty(LOCAL_SERVER_PORT)  + depts);
	}

	@GetMapping("/findAll")
	public List<Employees> findAllDepts() {
		logger.info("----------------------In Employees Controller ---finallEmps");
		return empService.getAllEmployees();
	}

	@GetMapping("/find/{eid}")
	public Employees findEmpById(@PathVariable Integer eid) {
		logger.info("----------------------In Employees Controller ---findByEmpId");
		return empService.getEmployeeById(eid);
	}

}
