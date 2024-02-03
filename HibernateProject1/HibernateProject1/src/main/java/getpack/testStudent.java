package getpack;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class testStudent {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		ArrayList<Student> arrayList = new ArrayList<Student>();

		Session session = factory.openSession();
//		Student student = (Student) session.get(Student.class, 1);
//		Student student1 = (Student) session.get(Student.class, 2);
// 		Student student2 = (Student) session.get(Student.class, 3);
		Student student2 = (Student) session.load(Student.class, 3);
//		System.out.println(student);
//		System.out.println(student1);
//		System.out.println(student2);
//		arrayList.add(student);
//		arrayList.add(student1);
		arrayList.add(student2);

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		session.close();
		factory.close();

	}

}
