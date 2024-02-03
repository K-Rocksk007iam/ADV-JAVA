package org.cdac.ScopeDemo;

import org.springframework.stereotype.Component;

@Component("Add1")
public class Address {
	private String line1;
	private String location;
	private String city;
	private String state;

	public Address() {
		System.out.println("Default Constructor of Address");
	}

	public Address(String line1, String location, String city, String state) {
		System.out.println("This is Parameterized Constructor");
		this.line1 = line1;
		this.location = location;
		this.city = city;
		this.state = state;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", location=" + location + ", city=" + city + ", state=" + state
				+ ", pincode=" + "]";
	}
	public void compile() {
		 System.out.println("Compiling the Program.");
	 }

}

