package org.cdac.ScopeDemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singletone")
public class Emp {
	private int eid;
	private String ename;
	private double sal;

	public Emp() {
		System.out.println("This is the default constructor");
	}

	public Emp(int eid, String ename, double sal) {
		System.out.println("This is Parameterized Constructor");
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
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

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}

	public void display() {
		System.out.println("This is Displaying method..");
	}

}
