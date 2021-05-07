package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entities.Departments;

public interface DepartmentDao extends JpaRepository<Departments, Integer>{

}
