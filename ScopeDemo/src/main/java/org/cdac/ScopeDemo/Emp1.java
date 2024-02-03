package org.cdac.ScopeDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Emp1 {
	private int eid;
	private String ename;
	private String technology;

	@Autowired
	@Qualifier("Lap1")
	private Laptop laptop;

	public Emp1() {
		System.out.println("This is My Default Constructor");
	}

	public Emp1(int eid, String ename, String technology, Laptop laptop) {
		System.out.println("This is my parameterized constructor..");
		this.eid = eid;
		this.ename = ename;
		this.technology = technology;
		this.laptop = laptop;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Emp1 [eid=" + eid + ", ename=" + ename + ", technology=" + technology + "]";
	}

	public void display() {
		System.out.println("This is My Displaying Method..");
		laptop.compile();
		System.out.println(laptop);
	}
}
