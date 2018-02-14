package com.geoTron.model;

public class Customer {
	String name;
	int policy_num;
	String vehicle;
	String fuel;
	String city;
	double lat;
	double lon;
	public Customer(String name, int policy_num, String vehicle, String fuel, String city, double lat, double lon) {
		super();
		this.name = name;
		this.policy_num = policy_num;
		this.vehicle = vehicle;
		this.fuel = fuel;
		this.city = city;
		this.lat = lat;
		this.lon = lon;
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
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
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
