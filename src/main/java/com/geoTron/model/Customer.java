package com.geoTron.model;

public class Customer {
	String uid;
	String name;
	String address;
	String phone_no;
	String license_no;
	String vehicle_type;
	String city;
	double lat;
	double lon;
	Vehicle vehicle;
	PolicyCoverage policy;
	public Customer() {
		super();
	}
	public Customer(String uid, String name, String address,String phone_no, String license_no, String vehicle_type,String city, double lat, double lon,Vehicle vehicle, PolicyCoverage policy) {
		super();
		this.uid = uid;
		this.name = name;
		this.address = address;
		this.phone_no = phone_no;
		this.license_no = license_no;
		this.vehicle_type = vehicle_type;
		this.city = city;
		this.lat = lat;
		this.lon = lon;
		this.vehicle = vehicle;
		this.policy = policy;
	}
	
	
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getLicense_no() {
		return license_no;
	}
	public void setLicense_no(String license_no) {
		this.license_no = license_no;
	}
	
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public PolicyCoverage getPolicy() {
		return policy;
	}
	public void setPolicy(PolicyCoverage policy) {
		this.policy = policy;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getVehicleType() {
		return vehicle_type;
	}
	public void setVehicleType(String vehicle_type) {
		this.vehicle_type = vehicle_type;
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
