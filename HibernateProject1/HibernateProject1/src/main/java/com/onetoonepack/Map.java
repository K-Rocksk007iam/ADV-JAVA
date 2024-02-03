package com.onetoonepack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Map {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// question objects
		Question que1 = new Question();
		que1.setQuestionId(11);
		que1.setQuestion("what is the feature of java");

		Question que2 = new Question();
		que2.setQuestionId(232);
		que2.setQuestion("what is framework");

		Question que3 = new Question();
		que3.setQuestionId(33);
		que3.setQuestion("what is python");

		// answer objects
		Answer ans1 = new Answer();
		ans1.setAnswerId(11);
		ans1.setAnswer("prog. lang.");

		Answer ans2 = new Answer();
		ans2.setAnswerId(234);
		ans2.setAnswer("collection of classes and interfaces");

		Answer ans3 = new Answer();
		ans3.setAnswerId(546);
		ans3.setAnswer("it is secured");

		// set answers
		que1.setAnswer(ans3);
		que2.setAnswer(ans2);
		que3.setAnswer(ans1);

		// set question
		ans1.setQuestion(que3);
		ans2.setQuestion(que2);
		ans3.setQuestion(que1);

		Session session = factory.openSession();
		session.beginTransaction();
		session.save(ans1);
		session.save(ans2);
		session.save(ans3);

		session.save(que1);
		session.save(que2);
		session.save(que3);

		session.getTransaction().commit();

		Question que11 = session.get(Question.class, 11);
		
		System.out.println(que11+"\n");
		Question que22 = session.get(Question.class, 232);
		System.out.println(que22+"\n");
		Question que33 = session.get(Question.class, 33);
		System.out.println(que33+"\n");

		session.close();
		factory.close();
	}

}
