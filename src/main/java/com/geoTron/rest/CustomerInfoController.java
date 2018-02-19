package com.geoTron.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geoTron.model.Customer;
import com.geoTron.model.CustomerMin;
import com.geoTron.service.CustomerDataService;

@RestController
public class CustomerInfoController {

	@Autowired
	private CustomerDataService customerDataService;
	
	@RequestMapping("/customers/{city}")
	public List<CustomerMin> retriveCustomerBasedOnLoc(@PathVariable String city){
		return customerDataService.retriveCustomerBasedOnLoc(city);
	}
	@RequestMapping("/customers/uid/{uid}")
	public Customer retrieveCustomerUID(@PathVariable String uid){
		return customerDataService.retrieveCustomerUID(uid);
	}
}
