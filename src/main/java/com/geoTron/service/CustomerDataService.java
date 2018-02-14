package com.geoTron.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.geoTron.model.Customer;

@Component
public class CustomerDataService {
	private static List<Customer> customers = new ArrayList<Customer>();
	static {
		Customer customer1 = new Customer("Vinod",123,"Audi","Petrol","Chennai",13.1422,80.2370);
		
		Customer customer2 = new Customer("Ramesh",123,"Audi","Petrol","Chennai",13.1482,80.2470);
		customers.add(customer1);
		customers.add(customer2);
	}
	public List<Customer> retriveCustomerBasedOnLoc(String loc) {
		List<Customer> customers_loc = new ArrayList<Customer>();
		for(Customer customer : customers) {
			if(customer.getCity().equalsIgnoreCase(loc)) {
				customers_loc.add(customer);
			}
			
		}
		return customers_loc;
	}
}
