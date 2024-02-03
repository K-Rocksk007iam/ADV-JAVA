package org.com.SpringBootProject3;

import org.springframework.stereotype.Component;

@Component
public class Emp {
	private int empId;
	private String ename;
	private double sal;

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(int empId, String ename, double sal) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.sal = sal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
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
		return "Emp [empId=" + empId + ", ename=" + ename + ", sal=" + sal + "]";
	}

	public void display() {
		System.out.println("This is Displaying Method......");
	}
}
