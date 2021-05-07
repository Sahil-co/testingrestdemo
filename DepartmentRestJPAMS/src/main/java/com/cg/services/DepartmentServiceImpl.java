package com.cg.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.DepartmentDao;
import com.cg.entities.Departments;

@Service
public class DepartmentServiceImpl implements IDepartmentService{

	@Autowired
	private DepartmentDao departmentDao;
	
	private static final Logger logger = LoggerFactory.getLogger(DepartmentServiceImpl.class);
	
	@Override
	public List<String> getAllDepartment() {
		logger.info("************In getdepartment***********");
		List<String> list = new ArrayList<>();
		list.add("IT");
		list.add("HR");
		return list;
	}

	@Override
	public Departments getDepartmentById(Integer deptId) {
		logger.info("************In getdepartment by id***********");
		Optional<Departments> dep = departmentDao.findById(deptId);
		return dep.get();
	}

	
}
