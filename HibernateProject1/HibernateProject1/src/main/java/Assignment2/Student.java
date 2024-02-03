package Assignment2;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	private int rollno;
	private String name;
	private String address;
	@OneToMany
	ArrayList<Book> books = new ArrayList<Book>();

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String name, String address, ArrayList<Book> books) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.books = books;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
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

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + ", books=" + books + "]";
	}

}
