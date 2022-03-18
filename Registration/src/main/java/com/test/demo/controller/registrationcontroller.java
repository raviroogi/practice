package com.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.Entity.registrationEntity;
import com.test.demo.service.registrationService;

@RestController
@RequestMapping(value="data")


public class registrationcontroller {
	@Autowired
	registrationService service;
	
	@PostMapping(value="save")
	//@RequestMapping (value= "/saveData",method= {RequestMethod.POST})
	public String ravi(Long id,String fullName,String  userName,String password,String phone,String email,String address) {
		service.save(id,fullName,userName,password,phone,email,address);
		return "saveDataSuccefully";
		
	}
	@PostMapping(value="getData")
	//@RequestMapping (value= "/getData",method= {RequestMethod.GET})
	public registrationEntity getData(Long id) {
		registrationEntity reData= service.find(id);
		return reData;



	}
}
	
