package org.cdac.ScopeDemo;

import java.awt.DisplayMode;

import org.springframework.stereotype.Component;

@Component("Lap1")
public class Laptop {
	private int id;
	private String brand;
	
	public Laptop() {
		System.out.println("Default Constructor of Laptop");
	}

	public Laptop(int id, String brand) {
		System.out.println("This is Parameterized Constructor");
		this.id = id;
		this.brand = brand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + "]";
	}
	 public void compile() {
		 System.out.println("Compiling the Program.");
	 }
	
}
