package com.acc.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acc.demo.entity.admin;
import com.acc.demo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class Rest {

	@Autowired
	private EmployeeService es;
	@GetMapping("/admin")
	public List<admin> findAll() {
		
		System.out.println("iss mai main aaya rezst");
		return es.findAll();
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

