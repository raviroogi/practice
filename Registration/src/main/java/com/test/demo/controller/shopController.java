package com.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.Entity.shopEntity;
import com.test.demo.service.shopService;

@RestController
//@RequestMapping(value= "Data")


public class shopController {
	@Autowired
	shopService ravi;
	@PostMapping(value="save")
	//@RequestMapping (value= "/saveData",method= {RequestMethod.POST})
	public String  shopsave(Long id, String shopName,String shopPhone,String pin,String shopEmail,String shopType) {
		ravi.save(id,shopName,shopPhone,pin,shopEmail,shopType);
		return "data saved";
		
	}
	//@PostMapping(value="saved")
	@RequestMapping (value= "/saveData",method= {RequestMethod.GET})
	public shopEntity save(Long id) {
		shopEntity ram= ravi.find(id);
		return ram;

	

}
	//@PostMapping(value="saved")
		@RequestMapping (value= "/findByshopName",method= {RequestMethod.GET})
		public shopEntity findByName(String name) {
			shopEntity ramu= ravi.findByName(name);
			return ramu;

}
}
