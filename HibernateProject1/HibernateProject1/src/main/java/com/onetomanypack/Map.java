package com.onetomanypack;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Map {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		List<Emp> emplist = new ArrayList<Emp>();
		Emp emp1 = new Emp(1, "kunal", 10000, 10);
		Emp emp2 = new Emp(2, "rahul", 80000, 10);
		Emp emp3 = new Emp(3, "dev", 50000, 10);

		
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);

		Dept dept1 = new Dept(10, "accounting", "nashik", emplist);
		

		Session session = factory.openSession();
		session.beginTransaction();
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(dept1);
		
		session.getTransaction().commit();
		session.close();
		factory.close();

	}

}
