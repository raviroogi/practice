package com.test.demo.service;

import com.test.demo.Entity.registrationEntity;

public interface registrationService {

	void save(Long id, String fullName, String userName, String password, String phone, String email, String address);

	registrationEntity find(Long id);

}
