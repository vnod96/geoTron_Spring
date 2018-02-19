package com.geoTron.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.geoTron.model.Customer;
import com.geoTron.model.CustomerMin;

@Component
public class CustomerDataService {
	private static List<Customer> customers = new ArrayList<Customer>();
	static {
		Customer customer1 = new Customer("C1234", "Akash",56789, "Ambattur, Chennai, Tamilnadu",	75340, "Gasoline", 2000, "Chennai", 13.1022, 80.1829);
		Customer customer2 = new Customer("C1235", "Bharathi", 56790, "Navalur, Chennai, Tamilnadu", 75340, "Electric", 2000, "Chennai", 12.8449, 80.2172);
		Customer customer3 = new Customer("C1236", "Dinesh", 56791, "Adayar,  Chennai, Tamilnadu", 75340, "Electric", 2000, "Chennai", 13.0287, 80.2277);
		Customer customer4 = new Customer("C1237", "Ganesh", 56792, "Perungudi,  Chennai, Tamilnadu", 75340, "Gasoline", 2000, "Chennai", 12.9488, 80.1981);
		Customer customer5 = new Customer("C1238", "Hema", 56793, "Taiyur, Kanchipuram, Tamil Nadu", 75340, "Gasoline", 2000, "Chennai", 12.7719, 80.1866);
		Customer customer6 = new Customer("C1239", "Ilango", 56794, "Teynampet, Chennai, Tamil Nadu", 75340, "Gasoline", 2000, "Chennai",	13.0469,80.2747);
		Customer customer7 = new Customer("C1240", "Jeyanth", 56795, "Thiru. Vi. Ka. Nagar, Chennai, Tamil Nadu",	75340, "Electric", 2000, "Chennai", 13.1047, 80.2335);
		Customer customer8 = new Customer("C1241", "Lakshmi", 56796, "Kodambakkam, Chennai, Tamil Nadu", 75340, "Electric", 2000,  "Chennai", 13.0371, 80.2299);
		Customer customer9 = new Customer("C1242", "Thiyagu", 56797, "Perungalathur, Thiruvallur district, Tamil Nadu", 75340, "Gasoline", 2000, "Chennai", 12.9285, 80.069);
		Customer customer10 = new Customer("C1243", "Vinod", 56798, "Sriperumbudur, Thiruvallur district, Tamil Nadu", 75340, "Gasoline", 2000, "Chennai",12.9054, 79.9726);
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);
		customers.add(customer6);
		customers.add(customer7);
		customers.add(customer8);
		customers.add(customer9);
		customers.add(customer10);
	}
	public List<CustomerMin> retriveCustomerBasedOnLoc(String loc) {
		List<CustomerMin> customers_loc = new ArrayList<CustomerMin>();
		for(Customer customer : customers) {
			if(customer.getCity().equalsIgnoreCase(loc)) {
				customers_loc.add(new CustomerMin(customer.getUid(),customer.getVehicleType(),customer.getCity(),customer.getLat(),customer.getLon()));
			}
			
		}
		return customers_loc;
	}
	public Customer retrieveCustomerUID(String uid) {
		for(Customer customer : customers) {
			if(customer.getUid().equals(uid)) {
				return customer;
			}
			
		}
		return new Customer();
	}
}
