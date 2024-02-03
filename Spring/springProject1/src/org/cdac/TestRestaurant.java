package org.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRestaurant {

	public static void main(String[] args) {

		ApplicationContext conetxt = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Restaurant restaurant1 = (Restaurant) conetxt.getBean("restaurantBean1");
		Restaurant restaurant2 = (Restaurant) conetxt.getBean("restaurantBean2");
		Restaurant restaurant3 = (Restaurant) conetxt.getBean("restaurantBean3");
		System.out.println("");
		restaurant1.greetCustomer();
		restaurant1.showMenu();
		restaurant1.placerOrder();
		restaurant1.serveFood();
		System.out.println("------------------------------------");
		restaurant2.greetCustomer();
		restaurant2.showMenu();
		restaurant2.placerOrder();
		restaurant2.serveFood();
		System.out.println("------------------------------------");
		restaurant3.greetCustomer();
		restaurant3.showMenu();
		restaurant3.placerOrder();
		restaurant3.serveFood();
		System.out.println("------------------------------------");

		Waiter waiter1 = (Waiter) conetxt.getBean("waiterBean1");
		waiter1.takeOrder();
		System.out.println("------------------------------------");

	}

}
