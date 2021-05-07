package com.cg.services;

import java.util.List;

import com.cg.entities.Departments;

public interface IDepartmentService {

	public List<String> getAllDepartment();
	public Departments getDepartmentById(Integer deptId);
	
}
