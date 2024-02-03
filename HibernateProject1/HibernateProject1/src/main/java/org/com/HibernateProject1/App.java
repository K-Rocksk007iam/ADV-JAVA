package org.com.HibernateProject1;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
//		Dept dept = new Dept();
//		dept.setDeptNo(10);
//		dept.setDname("accounting");
//		dept.setLoc("mumbai");
//		System.out.println(dept);
//
//		Dept dept2 = new Dept();
//		dept2.setDeptNo(20);
//		dept2.setDname("finance");
//		dept2.setLoc("pune");
//		System.out.println(dept);
//
//		Dept dept3 = new Dept();
//		dept3.setDeptNo(30);
//		dept3.setDname("marketing");
//		dept3.setLoc("bangalore");
//		System.out.println(dept);

		Scanner sc = new Scanner(System.in);
//		Student student1= new Student();
//		student1.setRollNo(1);
//		student1.setName("kunal");
//		student1.setAddress("nashik");
//		student1.setMarks(92);
//		
//		Student student2= new Student();
//		student2.setRollNo(2);
//		student2.setName("suraj");
//		student2.setAddress("pune");
//		student2.setMarks(95);
//		
//		Student student3= new Student();
//		student3.setRollNo(3);
//		student3.setName("prathamesh");
//		student3.setAddress("jalgaon");
//		student3.setMarks(97);
		System.out.println("Enter Roll_no of Student:");
		int rollNo = sc.nextInt();

		System.out.println("Enter Name of the Student:");
		String name = sc.next();

		System.out.println("Enter Address of the Student;");
		String address = sc.next();

		System.out.println("Enter Marks he Got:");
		double marks = sc.nextDouble();

		Student student = new Student(rollNo, name, address, marks);

		Session session = factory.openSession();
		session.beginTransaction();
//		session.save(dept);
//		session.save(dept2);
//		session.save(dept3);
		session.save(student);
//		session.save(student1);
//		session.save(student2);
//		session.save(student3);
		session.getTransaction().commit();
		session.close();
		factory.close();

	}
}
