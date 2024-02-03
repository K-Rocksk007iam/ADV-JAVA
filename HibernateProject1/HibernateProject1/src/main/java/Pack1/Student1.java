package Pack1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student1 {
@Id
private int rollNo;
private String name;
@Column(name="address")
private String add;
private double score;

public Student1() {
	rollNo=0;
	name="";
	add="";
	score=0.0;
}

public Student1(int rollNo, String name, String add, double score) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.add = add;
	this.score = score;
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

public String getAdd() {
	return add;
}

public void setAdd(String add) {
	this.add = add;
}

public double getScore() {
	return score;
}

public void setScore(double score) {
	this.score = score;
}

@Override
public String toString() {
	return "Student1 [rollNo=" + rollNo + ", name=" + name + ", add=" + add + ", score=" + score + "]";
}

}
