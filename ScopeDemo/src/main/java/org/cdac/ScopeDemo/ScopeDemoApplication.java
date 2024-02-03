package org.cdac.ScopeDemo;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ScopeDemoApplication {
	public static void main(String[] args) {
//		System.out.println("It is a Scope Project....");
//		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Spring Boot...");
		ConfigurableApplicationContext context = SpringApplication.run(ScopeDemoApplication.class, args);

		Customer cust = context.getBean(Customer.class);

		Address add = context.getBean(Address.class);
		add.setLine1("Servey 57");
		add.setLocation("Shahada");
		add.setCity("Shahada");
		add.setState("Maharastra");
		add.compile();
		cust.display();
//		Emp1 emp = context.getBean(Emp1.class);
//		emp.display();
//
//		Laptop laptop = context.getBean(Laptop.class);
//		laptop.setId(123456);
//		laptop.setBrand("Asus ROG");
//
//		emp.setEid(1);
//		emp.setEname("Himanshu");
//		emp.setTechnology("DSA");
//		emp.setLaptop(laptop);
//		emp.display();
		// Emp emp = context.getBean(Emp.class);
		// emp.display();

//		Emp emp2 = context.getBean(Emp.class);
//		emp2.display();
//
//		Emp emp3 = context.getBean(Emp.class);
//		emp3.display();
//
//		Emp emp4 = context.getBean(Emp.class);
//		emp4.display();
//
//		Emp emp5 = context.getBean(Emp.class);
//		emp5.display();

	}

}
