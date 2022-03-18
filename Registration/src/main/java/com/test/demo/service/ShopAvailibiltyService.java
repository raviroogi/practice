package com.test.demo.service;

public interface ShopAvailibiltyService  {

	

	void save(Long id, String fromDate, String toDate, String fromTime, String toTime, String intervals,
			String shopType);

}
