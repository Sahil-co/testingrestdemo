package com.cg.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empms")
public class Employees implements Serializable{

	@Id
	private int empId;
	private String empName;
	private int deptId;
	private double salary;
	
	public Employees() {
		// TODO Auto-generated constructor stub
	}

	public Employees(int empId, String empName, int deptId, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptId = deptId;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
