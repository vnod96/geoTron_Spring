package com.geoTron.model;

public class CustomerMin {
		String uid;
		String vehicle_type;
		String city;
		double lat;
		double lon;

public CustomerMin(String uid, String vehicle_type, String city, double lat, double lon) {
	super();
	this.uid = uid;
	this.vehicle_type = vehicle_type;
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
