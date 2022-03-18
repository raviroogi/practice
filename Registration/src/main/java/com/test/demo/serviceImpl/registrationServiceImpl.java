package com.test.demo.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.Entity.registrationEntity;
import com.test.demo.repository.registrationrepository;
import com.test.demo.service.registrationService;
@Service

public class registrationServiceImpl implements registrationService {
	@Autowired
	registrationrepository result;

	@Override
	public void save(Long id, String fullName, String userName, String password, String phone, String email,
			String address) {
		
		registrationEntity a = new registrationEntity();
		
		a.setId(id);
		a.setFullName(fullName);
		a.setUserName(userName);
		a.setPassword(password);
		a.setPhone(phone);
		a.setEmail(email);
		a.setAddress(address);
		
		result.save(a);
		
	}

	@Override
	public registrationEntity find(Long id) {
		return result.findById(id).get();
		
	}



}
