package com.onetomanypack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Emp {
	@Id
	private int empId;
	private String ename;
	@Column(name = "salary")
	private double sal;
	
	private int deptNo;

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(int empId, String ename, double sal, int deptNo) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.sal = sal;
		this.deptNo = deptNo;
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

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", ename=" + ename + ", sal=" + sal + ", deptNo=" + deptNo + "]";
	}

}
