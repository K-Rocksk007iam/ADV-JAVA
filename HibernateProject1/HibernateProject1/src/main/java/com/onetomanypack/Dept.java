package com.onetomanypack;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Dept {
	@Id
	private int deptNo;
	private String dname;
	@Column(name = "location")
	private String loc;
	@OneToMany(mappedBy = "empId")
	private List<Emp> emps;

	public Dept() {
		// TODO Auto-generated constructor stub
	}

	public Dept(int deptNo, String dname, String loc, List<Emp> emps) {
		super();
		this.deptNo = deptNo;
		this.dname = dname;
		this.loc = loc;
		this.emps = emps;
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

	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

	@Override
	public String toString() {
		return "Dept [deptNo=" + deptNo + ", dname=" + dname + ", loc=" + loc + ", emps=" + emps + "]";
	}

}
