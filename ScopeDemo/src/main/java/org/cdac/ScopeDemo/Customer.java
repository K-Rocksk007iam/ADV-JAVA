package org.cdac.ScopeDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	private int cid;
	private String name;
	@Autowired
	@Qualifier("Add1")
	private Address address;

	public Customer() {
		System.out.println("This is My Default Constructor");
	}

	public Customer(int cid, String name, Address address) {
		super();
		this.cid = cid;
		this.name = name;
		this.address = address;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", address=" + address + "]";
	}

	public void display() {
		System.out.println("This is My Displaying Method..");
		address.compile();
		System.out.println(address);
	}

}
