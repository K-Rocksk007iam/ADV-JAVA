package Pack1;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Tester {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
//		Student1 student1 = new Student1(1, "Himanshu", "Shahada", 98);
//		Student1 student2 = new Student1(2, "Yadneysh", "Satara", 88);
//		Student1 student3 = new Student1(3, "Prathmesh", "Satana", 78);
//		Student1 student4 = new Student1(4, "Sameer", "Nashik", 68);

		Address address=new Address();
		address.setCity("Nashik");
		address.setOpen(true);
		address.setX(56.4);
		address.setDate1(new Date());
		System.out.println(address);
		
		Address address1=new Address();
		address1.setCity("Pune");
		address1.setOpen(true);
		address1.setX(76.4);
		address1.setDate1(new Date());
		System.out.println(address1);
		
		Session session = factory.openSession();
		session.beginTransaction();
//		session.save(student1);
//		session.save(student2);
//		session.save(student3);
//		session.save(student4);
		session.save(address);
		session.save(address1);
		session.getTransaction().commit();
		session.close();
		factory.close();

	}

}
