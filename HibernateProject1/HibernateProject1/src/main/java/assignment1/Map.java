package assignment1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.onetoonepack.Question;

public class Map {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Person p1 = new Person();
		p1.setPid(1);
		p1.setName("rabindranath tagore");
		p1.setAddress("kolkata");

		Person p2 = new Person();
		p2.setPid(2);
		p2.setName("mahatma gandi(bapu)");
		p2.setAddress("gujarat");

		PanCard c1 = new PanCard();
		
		c1.setId(1121312343);

		PanCard c2 = new PanCard();
		c2.setId(221233254);

		c1.setPerson(p1);
		c2.setPerson(p2);

		Session session = factory.openSession();
		session.beginTransaction();
		session.save(p1);
		session.save(p2);
		session.save(c1);
		session.save(c2);
		session.getTransaction().commit();

		session.close();
		factory.close();

	}

}
