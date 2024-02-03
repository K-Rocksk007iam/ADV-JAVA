package com.org;

public class Tea implements IHotDrink {

	@Override
	public void prepareHotDrink() {
		System.out.println("Preparing tea class");
		System.out.println("Preparing tea for customers");
	}
}
