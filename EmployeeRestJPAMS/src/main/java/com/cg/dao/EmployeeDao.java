package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.Employees;

@Repository
public interface EmployeeDao extends JpaRepository<Employees, Integer>{

}
