package manytomanypack;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Map {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Project project1 = new Project();
		project1.setPid(1);
		project1.setProjectName("sweetmart shop");

		Project project2 = new Project();
		project2.setPid(2);
		project2.setProjectName("gym managment");

		Emp emp1 = new Emp();
		emp1.setEid(11);
		emp1.setEname("kunal");

		Emp emp2 = new Emp();
		emp2.setEid(22);
		emp2.setEname("rahul");

		ArrayList<Emp> emplist = new ArrayList<Emp>();
		ArrayList<Project> projectlist = new ArrayList<Project>();

		emplist.add(emp1);
		emplist.add(emp2);

		projectlist.add(project1);
		projectlist.add(project2);

		emp1.setProjects(projectlist);
		project1.setEmps(emplist);

		Session session = factory.openSession();
		session.beginTransaction();
		session.save(emp1);
		session.save(emp2);
		session.save(project1);
		session.save(project2);

		session.getTransaction().commit();
		session.close();
		factory.close();

	}

}
