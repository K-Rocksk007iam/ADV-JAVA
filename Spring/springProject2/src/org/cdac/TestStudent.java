package org.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		ApplicationContext conetxt = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Student stud = (Student) conetxt.getBean("studentBean1");
		stud.attendClassses();
		stud.markAttendace();
		System.out.println("Name is : " + stud.getName());
		System.out.println("roll no is : " + stud.getRollNo());
		System.out.println("score is : " + stud.getScore());
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		Student stud1 = (Student) conetxt.getBean("studentBean2");
		stud1.attendClassses();
		stud1.markAttendace();
		System.out.println("Name is : " + stud1.getName());
		System.out.println("roll no is : " + stud1.getRollNo());
		System.out.println("score is : " + stud1.getScore());
	}

}
