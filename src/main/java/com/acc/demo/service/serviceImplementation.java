package com.acc.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.acc.demo.dao.admininterface;
import com.acc.demo.entity.admin;

@Service
public class serviceImplementation implements EmployeeService {
	
	@Autowired
	private admininterface adi;

	@Override
	public List<admin> findAll() {
		// TODO Auto-generated method stub
		System.out.println("iss mai main aaya rezst");
		return adi.findAll();
	}

	
	
	@Override
	public void save(admin theadmin) {
		adi.save(theadmin);
		
	}

	@Override
	public void deleteById(String Email) {
		adi.deleteById(Email);
		
	}

	@Override
	public admin findById(String Email) {
		Optional<admin> adm=adi.findById(Email);
		
		admin adm2=null;
		
		if(adm.isPresent())
		{
			adm2=adm.get();
		}
		else {
			throw new RuntimeException("Did not find admin id - " + Email);
		}
		return adm2;
	}

}
