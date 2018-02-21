package com.geoTron.model;

public class Vehicle {
	String vin;
	String vehicle_type;
	String plate_no;
	int odometer;
	
	public Vehicle() {
		super();
	}

	public Vehicle(String vin, String vehicle_type, String plate_no, int odometer) {
		super();
		this.vin = vin;
		this.vehicle_type = vehicle_type;
		this.plate_no = plate_no;
		this.odometer = odometer;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getVehicle_type() {
		return vehicle_type;
	}

	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}

	public String getPlate_no() {
		return plate_no;
	}

	public void setPlate_no(String plate_no) {
		this.plate_no = plate_no;
	}

	public int getOdometer() {
		return odometer;
	}

	public void setOdometer(int odometer) {
		this.odometer = odometer;
	}
	
	
}
