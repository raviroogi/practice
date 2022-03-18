package com.test.demo.service;

import com.test.demo.Entity.shopEntity;

public interface shopService {

	void save(Long id, String shopName, String shopPhone, String pin, String shopEmail, String shopType);

	shopEntity find(Long id);

	shopEntity findByName(String name);

	//shopEntity findByshopName(String name);

}
