package org.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Restaurant restaurant = (Restaurant) context.getBean("restaurantBean");
		restaurant.displayWaiterList();
	}
	
}
