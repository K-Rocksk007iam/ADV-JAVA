package org.com.SpringBootProject3;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String line1;
	private String location;
	private String city;
	private String state;
	private int pincode;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String line1, String location, String city, String state, int pincode) {
		super();
		this.line1 = line1;
		this.location = location;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", location=" + location + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}

}
