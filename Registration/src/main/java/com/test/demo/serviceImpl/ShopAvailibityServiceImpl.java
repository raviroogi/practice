package com.test.demo.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.Entity.shopAvailabilityEntity;
import com.test.demo.repository.ShopAvailibityrepo;
import com.test.demo.service.ShopAvailibiltyService;
@Service

public class ShopAvailibityServiceImpl implements ShopAvailibiltyService{
 @Autowired
 ShopAvailibityrepo done;

	@Override
	public void save(Long id, String fromDate, String toDate, String fromTime, String toTime, String intervals,
			String shopType) {
	 shopAvailabilityEntity b = new shopAvailabilityEntity();
	 b.setId(id);
	 b.setFromDate(fromDate);
	 b.setToDate(toDate);
	 b.setFromTime(fromTime);
	 b.setToTime(toTime);
	 b.setIntervals(intervals);
	 b.setShopType(shopType);
	 
	 done.save(b);
		
	}

	
		
	}

	

