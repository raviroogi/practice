package com.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.service.ShopAvailibiltyService;

@RestController
@RequestMapping(value="data")

public class shopAvailabilitycontroller {
	@Autowired
	ShopAvailibiltyService data;
	
	
	@PostMapping(value="saved")
	//@RequestMapping (value= "/saveData",method= {RequestMethod.POST})
	public String  shop(Long id, String fromDate,String toDate,String fromTime,String toTime,String intervals,String shopType) {
		data.save(id,fromDate,toDate,fromTime,toTime,intervals,shopType);
		return "Shop Is Creatred";
		
	}
	


}
