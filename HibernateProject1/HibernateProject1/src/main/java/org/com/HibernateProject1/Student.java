package org.com.HibernateProject1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int rollNo;
	private String name;
	private String address;
	private double marks;
	
	public Student() {
		rollNo=0;
		name="";
		address="";
		marks=0;
	}

	public Student(int rollNo, String name, String address, double marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}
	
	
}
