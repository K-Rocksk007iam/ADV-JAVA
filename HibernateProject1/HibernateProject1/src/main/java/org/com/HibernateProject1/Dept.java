package org.com.HibernateProject1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dept {
	@Id
	private int deptNo;
	private String dname;
	private String loc;

	public Dept() {
		deptNo = 0;
		dname = "";
		loc = "";
	}

	public Dept(int deptNo, String dname, String loc) {
		super();
		this.deptNo = deptNo;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Dept [deptNo=" + deptNo + ", dname=" + dname + ", loc=" + loc + "]";
	}

}
