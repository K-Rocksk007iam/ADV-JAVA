package com.org;

public class Restaurant {

	IHotDrink hotDrink;

	public Restaurant(IHotDrink hotDrink) {
		super();
		this.hotDrink = hotDrink;
	}

	public void prepareHotDrink() {
		hotDrink.prepareHotDrink();
	}
}
