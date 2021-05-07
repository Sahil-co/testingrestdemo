package com.cg.services;

import java.util.List;

import com.cg.entities.Employees;

public interface IEmployeeService {
	
	public List<Employees> getAllEmployees();

	public Employees getEmployeeById(Integer empId);

}
