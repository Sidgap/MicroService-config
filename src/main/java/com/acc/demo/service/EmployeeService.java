package com.acc.demo.service;

import java.util.List;

import com.acc.demo.entity.admin;



public interface EmployeeService {

public List<admin> findAll();
	
	public admin findById(String Email);
	
	public void save(admin theEmployee);
	
	public void deleteById(String Email);
	
}
