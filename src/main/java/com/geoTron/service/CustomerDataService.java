package com.geoTron.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.geoTron.model.Customer;
import com.geoTron.model.CustomerMin;
import com.geoTron.model.PolicyCoverage;
import com.geoTron.model.Vehicle;

@Component
public class CustomerDataService {
	private static List<Customer> customers = new ArrayList<Customer>();
	static {
		Customer customer1 = new Customer("C1234", "Akash","09912342345","QWE1234", "Ambattur, Chennai, Tamilnadu", "Gasoline", "Chennai", 13.1022, 80.1829, new Vehicle("1ABCD123123B","SUV","TN75340",15000),new PolicyCoverage("AUT56723","12/2/2011 - 12/2/2020",100000,250,250,250,2000));
		Customer customer2 = new Customer("C1235", "Bharathi", "9521367843", "QWE4367", "Navalur, Chennai, Tamilnadu", "Electric", "Chennai", 12.8449, 80.2172, new Vehicle("1ABCD123153B"," Sedan", "TN75341",15000),new PolicyCoverage("AUT56724","12/2/2011 - 12/2/2020",100000,250,250,250,2000));
		Customer customer3 = new Customer("C1236", "Dinesh", "9521367844", "QWE4368", "Adayar,  Chennai, Tamilnadu", "Electric", "Chennai", 13.0287, 80.2277, new Vehicle("1ABCD123154B"," Hatchback"," TN75342",15000),new PolicyCoverage("AUT56725","12/2/2011 - 12/2/2020",100000,250,250,250,2000));
		Customer customer4 = new Customer("C1237", "Ganesh", "9521367845", "QWE4369", "Perungudi,  Chennai, Tamilnadu", "Gasoline", "Chennai", 12.9488, 80.1981, new Vehicle("1ABCD123155B"," Hatchback"," TN75343",15000),new PolicyCoverage("AUT56726","12/2/2011 - 12/2/2020",100000,250,250,250,2000));
		Customer customer5 = new Customer("C1238", "Hema", "9521367846", "QWE4370", "Taiyur, Kanchipuram, Tamil Nadu", "Gasoline", "Chennai", 12.7719, 80.1866, new Vehicle("1ABCD123156B",	" Hatchback", "TN75344",15000),new PolicyCoverage("AUT56727","12/2/2011 - 12/2/2020",100000,250,250,250,2000));
		Customer customer6 = new Customer("C1239", "Ilango", "9521367847", "QWE4371", "Teynampet, Chennai, Tamil Nadu", "Gasoline", "Chennai",	13.0469,80.2747, new Vehicle("1ABCD123157B","SUV",	"TN75345",15000), new PolicyCoverage("AUT56728","12/2/2011 - 12/2/2020",100000,250,250,250,2000));
		Customer customer7 = new Customer("C1240", "Jeyanth", "9521367848", "QWE4372", "Thiru. Vi. Ka. Nagar, Chennai, Tamil Nadu", "Electric", "Chennai", 13.1047, 80.2335, new Vehicle("1ABCD123158B","SUV", "TN75346",15000), new PolicyCoverage("AUT56729","12/2/2011 - 12/2/2020",100000,250,250,250,2000));
		Customer customer8 = new Customer("C1241", "Lakshmi", "9521367849", "QWE4373", "Kodambakkam, Chennai, Tamil Nadu", "Electric", "Chennai", 13.0371, 80.2299, new Vehicle("1ABCD123159B",	"Sedan","TN75347",15000), new PolicyCoverage("AUT56730","12/2/2011 - 12/2/2020",100000,250,250,250,2000));
		Customer customer9 = new Customer("C1242", "Thiyagu", "9521367850", "QWE4374", "Perungalathur, Thiruvallur district, Tamil Nadu", "Gasoline", "Chennai", 12.9285, 80.069, new Vehicle("1ABCD123160B","Hatchback","TN75348",15000), new PolicyCoverage("AUT56731","12/2/2011 - 12/2/2020",100000,250,250,250,2000));
		Customer customer10 = new Customer("C1243", "Vinod", "9521367851", "QWE4375", "Sriperumbudur, Thiruvallur district, Tamil Nadu", "Gasoline", "Chennai",12.9054, 79.9726, new Vehicle("1ABCD123161B","MPV","TN75349",15000), new PolicyCoverage("AUT56732","12/2/2011 - 12/2/2020",100000,250,250,250,2000));
		Customer customer11 = new Customer("B1244", "Naren", "9521367853","FRT5439", "Old Taluk Cutchery Road, Sultanpete, Chickpete, West Zone, Bengaluru, Bangalore Urban, Karnataka, 560053, India", "Gasoline","Bangalore", 12.97116, 77.57356, new Vehicle("1TGHD123156H","Hatchback","KA75643",15000),new PolicyCoverage("AUT67459","01/01/2015 - 01/01/2020",100000,250,250,250,2000));
		Customer customer12 = new Customer("B1245","Ashwin","9521367854","FRT5440","Doctor B R Ambedkar Veedhi, Cubbonpet, Sampangiram Nagar Ward, East Zone, Bengaluru, Bangalore Urban, Karnataka, 560052, India","Electric","Bangalore",12.98088, 77.59169, new Vehicle("1TGHD123157H","SUV","KA75644",15000),new PolicyCoverage("AUT67460","01/01/2015 - 01/01/2020",100000,250,250,250,2000));
		Customer customer13 = new Customer("B1246","Murali","9521367855","FRT5441","Lower Palace Orchard, Rajamahal Guttahalli, West Zone, Bengaluru, Bangalore Urban, Karnataka, 560003, India","Electric","Bangalore",12.9999,77.5865, new Vehicle("1TGHD123158H","SUV","KA75645",15000),new PolicyCoverage("AUT67461","01/01/2015 - 01/01/2020",100000,250,250,250,2000));
		Customer customer14 = new Customer("B1247","Abbas","9521367856","FRT5442","Chakravarty Layout, Vasanth Nagar, East Zone, Bengaluru, Bangalore Urban, Karnataka, 560020, India","Electric","Bangalore",12.9841, 77.5808, new Vehicle("1TGHD123159H","Sedan","KA75646",15000), new PolicyCoverage("AUT67462","01/01/2015 - 01/01/2020",100000,250,250,250,2000));
		Customer customer15 = new Customer("B1249","Venkat","9521367857","FRT5443","Lalbagh Fort Road, Mavalli, Vishveshwara Puram, South Zone, Bengaluru, Bangalore Urban, Karnataka, 560002, India","Gasoline","Bangalore",12.95397, 77.57495, new Vehicle("1TGHD123160H","Hatchback","KA75647",15000), new PolicyCoverage("AUT67463","01/01/2015 - 01/01/2020",100000,250,250,250,2000));
		Customer customer16 = new Customer("B1250","Vijay","9521367858","FRT5444","Krishna Rajendra Road, Sunkenahalli Ward, South Zone, Bengaluru, Bangalore Urban, Karnataka, 560002, India","Electric","Bangalore",12.95397, 77.57307, new Vehicle("1TGHD123161H","MPV","KA75648",15000), new PolicyCoverage("AUT67464","01/01/2015 - 01/01/2020",100000,250,250,250,2000));
		Customer customer17 = new Customer("B1251","Ajith","9521367859","FRT5445","Rajajinagar 5th Block, Dr. Raj Kumar Ward, West Zone, Bengaluru, Bangalore Urban, Karnataka, 560010, India","Gasoline","Bangalore",12.9937, 77.5668, new Vehicle("1TGHD123164H","Convertible","KA75651",15000), new PolicyCoverage("AUT67465","01/01/2015 - 01/01/2020",100000,250,250,250,2000));
		Customer customer18 = new Customer("B1252","Surya","9521367860","FRT5446","Railway Colony, Subhash Nagar, West Zone, Bengaluru, Bangalore Urban, Karnataka, 560023, India","Electric","Bangalore",12.9741, 77.5524, new Vehicle("1TGHD123162H","SUV","KA75649",15000), new PolicyCoverage("AUT67466","01/01/2015 - 01/01/2020",100000,250,250,250,2000));
		Customer customer19 = new Customer("B1253","Vikram","9521367861","FRT5447","Balepet, Chickpete, West Zone, Bengaluru, Bangalore Urban, Karnataka, 560053, India","Gasoline","Bangalore",12.9795, 77.576, new Vehicle("1TGHD123163H","Sedan","KA75650",15000), new PolicyCoverage("AUT67467","01/01/2015 - 01/01/2020",100000,250,250,250,2000));
		/*Customer customer20 = new Customer("L1254","Mike",56809,"East 129th Street, Willowbrook, Athens, Los Angeles County, California, 90037, United States of America","LA42576","Electric",3000,"Los Angeles",33.9155, -118.2674);
		Customer customer21 = new Customer("L1255","John",56810,"South Evers Avenue, Willowbrook, West Compton, Los Angeles County, California, 90222, United States of America","LA42976","Gasoline",3000,"Los Angeles",33.9039, -118.2477);
		Customer customer22 = new Customer("L1256","Tinia",56811,"Amantha Avenue, Keystone, Carson, Los Angeles County, California, 90746, United States of America","LA425436","Gasoline",3000,"Los Angeles",33.8717, -118.2498);
		Customer customer23 = new Customer("L1257","Marck",56812,"430, West Cummings Street, Compton, Los Angeles County, California, 90805, United States of America","LA42776","Electric",3000,"Los Angeles",33.876, -118.20825);
		Customer customer24 = new Customer("L1258","Jones",56813,"Westcliff Drive, Balboa Island, Newport Beach, Orange County, California, 92660, United States of America","LA02576","Gasoline",3000,"Los Angeles",33.62425, -117.90142);
		Customer customer25 = new Customer("L1259","Clarke",56814,"East 6th Street, Arts District, Little Tokyo Historic District, Los Angeles, Los Angeles County, California, 90013, United States of America","LA40576","Gasoline",3000,"Los Angeles",34.038, -118.2392);
		Customer customer26 = new Customer("L1260","Wesley",56815,"State Street, Brooklyn Heights, Boyle Heights, Los Angeles, Los Angeles County, California, 90013, United States of America","LA40576","Gasoline",3000,"Los Angeles",34.045, -118.2179);
		Customer customer27 = new Customer("L1261","Brent",56816,"Mission Road, Mission Junction, Little Tokyo Historic District, Los Angeles, Los Angeles County, California, 90012, United States of America","LA02576","Electric",3000,"Los Angeles",34.0576, -118.2215);
		Customer customer28 = new Customer("L1262","Karl",56817,"Montebello, East 3rd Street, Little Tokyo, Little Tokyo Historic District, Los Angeles, Los Angeles County, California, 90012, United States of America","LA00576","Electric",3000,"Los Angeles",34.04821, -118.24387);
		Customer customer29 = new Customer("L1263","Hogh",56818,"1210, Industrial Street, Skid Row, Little Tokyo Historic District, Los Angeles, Los Angeles County, California, 90021, United States of America","LA42506","Electric",3000,"Los Angeles",34.03801, -118.24154);*/
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
		customers.add(customer11);
		customers.add(customer12);
		customers.add(customer13);
		customers.add(customer14);
		customers.add(customer15);
		customers.add(customer16);
		customers.add(customer17);
		customers.add(customer18);
		customers.add(customer19);
		/*customers.add(customer20);
		customers.add(customer21);
		customers.add(customer22);
		customers.add(customer23);
		customers.add(customer24);
		customers.add(customer25);
		customers.add(customer26);
		customers.add(customer27);
		customers.add(customer28);
		customers.add(customer29);*/
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
