package org.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Student student = (Student) context.getBean("studentBean");
		Student student1 = (Student) context.getBean("studentBean1");
		student.markAteendance();

		Emp emp1 = (Emp) context.getBean("empBean");
		emp1.checkLeave();

		((AbstractApplicationContext) context).registerShutdownHook();
	}

}
