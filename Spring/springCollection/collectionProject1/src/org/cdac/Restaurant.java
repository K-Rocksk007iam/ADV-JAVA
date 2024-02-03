package org.cdac;

import java.util.List;

public class Restaurant {
	private List restaurantWaiterList;

	public void setRestaurantWaiterList(List restaurantWaiterList) {
		this.restaurantWaiterList = restaurantWaiterList;
	}

	public void displayWaiterList() {
		System.out.println("Names are : " + restaurantWaiterList);
	}

}
