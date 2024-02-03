package org.com.SpringBootProject3;

import javax.swing.text.AbstractDocument.Content;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootProject3Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Spring Boot...");
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootProject3Application.class, args);

		// Craeting class for Address:

		Address add = context.getBean(Address.class);
		add.setLine1("Servey 57,Plot 5,Rahjanse nagar");
		add.setLocation("Shahada");
		add.setCity("Shahada");
		add.setState("Maharastra");
		add.setPincode(425409);
		System.out.println("Displaying the Object");
		System.out.println(add);

		// Creating class for Student:

//		Student student = context.getBean(Student.class);
//		student.setId(21);
//		student.setName("Himanshu");
//		student.setScore(99.1);
//		student.display();
//		System.out.println("Displaying the object");
//
//		// Method-1
//		System.out.println(student);
//		System.out.println("===================================================================");
//		// Method-2
//		System.out.println("Roll No:" + student.getId());
//		System.out.println("Name is:" + student.getName());
//		System.out.println("Score is:" + student.getScore());
//
//		System.out.println("========================================");

		// Creating class for Emp:

//		Emp emp = context.getBean(Emp.class);
//		System.out.println("Enter EmpId,Ename and Salary:");
//		int i = sc.nextInt();
//		String name = sc.next();
//		double sal = sc.nextDouble();
//
//		emp.setEmpId(i);
//		emp.setEname(name);
//		emp.setSal(sal);
//
//		System.out.println("Displaying the obj details:" + emp);
//		System.out.println("Calling the display method :");
//		emp.display();
//
//		System.out.println("=========================================");
//		System.out.println("Creating 2nd object");
//		Emp emp1 = context.getBean(Emp.class);
//		System.out.println("Enter EmpId,Ename and Salary:");
//		int i1 = sc.nextInt();
//		String name1 = sc.next();
//		double sal1 = sc.nextDouble();
//
//		emp.setEmpId(i1);
//		emp.setEname(name1);
//		emp.setSal(sal1);
//
//		System.out.println("Displaying the obj details:" + emp1);
//		System.out.println("Calling the display method :");
//		emp1.display();

	}

}
