package org.test;

import org.beans.Emp;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Tester {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("org/resources/SpringConfig.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		Object obj = factory.getBean("empBean");
		Emp emp = (Emp) obj;
		emp.markAttendance();

	}

}
