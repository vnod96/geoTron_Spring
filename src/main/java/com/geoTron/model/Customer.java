package com.geoTron.model;

public class Customer {
	String uid;
	String name;
	int policy_num;
	String address;
	String vehicle_number;
	String vehicle_type;
	int premium;
	String city;
	double lat;
	double lon;
	
	public Customer() {
		super();
	}
	public Customer(String uid, String name, int policy_num, String address, String vehicle_number, String vehicle_type, int premium, String city, double lat, double lon) {
		super();
		this.uid = uid;
		this.name = name;
		this.policy_num = policy_num;
		this.address = address;
		this.vehicle_number = vehicle_number;
		this.vehicle_type = vehicle_type;
		this.premium = premium;
		this.city = city;
		this.lat = lat;
		this.lon = lon;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPolicy_num() {
		return policy_num;
	}
	public void setPolicy_num(int policy_num) {
		this.policy_num = policy_num;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getVehicleNumber() {
		return vehicle_number;
	}
	public void setVehicleNumber(String vehicle_number) {
		this.vehicle_number = vehicle_number;
	}
	public String getVehicleType() {
		return vehicle_type;
	}
	public void setVehicleType(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}
	public int getPremiun() {
		return premium;
	}
	public void setPremium(int premium) {
		this.premium = premium;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	
}
