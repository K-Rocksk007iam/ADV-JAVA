package assignment1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int pid;
	private String name;
	private String address;
	@OneToOne
	private PanCard card;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int pid, String name, String address, PanCard card) {
		super();
		this.pid = pid;
		this.name = name;
		this.address = address;
		this.card = card;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
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

	public PanCard getCard() {
		return card;
	}

	public void setCard(PanCard card) {
		this.card = card;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", address=" + address + ", card=" + card + "]";
	}

}
