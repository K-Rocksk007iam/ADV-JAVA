package assignment1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PanCard {
	@Id
	private int id;
	@OneToOne
	private Person person;
	
	public PanCard() {
		// TODO Auto-generated constructor stub
	}

	public PanCard(int id, Person person) {
		super();
		this.id = id;
		this.person = person;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "PanCard [id=" + id + ", person=" + person + "]";
	}
	
	
	
}
