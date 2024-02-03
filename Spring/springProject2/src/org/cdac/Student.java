package org.cdac;

public class Student {
	private String name;
	private int rollNo;
	private double score;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void attendClassses() {
		System.out.println("attendance");
	}

	public void markAttendace() {
		System.out.println("marking attendance");
	}
}
