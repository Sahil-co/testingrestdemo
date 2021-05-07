package com.cg.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.EmployeeDao;
import com.cg.entities.Employees;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService {
	private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	@Autowired
	private EmployeeDao empDao;

	@Override
	public List<Employees> getAllEmployees() {
		logger.info("in finAll emp service Impl...!!!");
		return empDao.findAll();
	}

	@Override
	public Employees getEmployeeById(Integer empId) {
		logger.info("in find By Id emp service Impl...!!!");
		return empDao.findById(empId).get();
	}

}