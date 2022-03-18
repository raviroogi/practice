package com.test.demo.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.Entity.shopEntity;
import com.test.demo.repository.shopRepo;
import com.test.demo.service.shopService;
@Service

public class shopServiceImpl implements shopService {
	@Autowired
	shopRepo service;

	@Override
	public void save(Long id, String shopName, String shopPhone, String pin, String shopEmail, String shopType) {
		
		shopEntity a= new shopEntity();
		a.setId(id);
		a.setShopName(shopName);
		a.setShopPhone(shopPhone);
		a.setPin(pin);
		a.setShopEmail(shopEmail);
		a.setShopType(shopType);
		service.save(a);
	
		
	}

	@Override
	public shopEntity find(Long id) {
		return service.findById(id).get();
		
	}

	//@Override
	//public shopEntity findByName(String name) {
		//return service.findByName(name);
	//}

	@Override
	public shopEntity findByName(String name) {
		return service.findByshopName(name);
		
	}



}
