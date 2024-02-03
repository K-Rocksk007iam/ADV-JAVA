package Pack1;

import java.util.Date;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.mysql.cj.xdevapi.Type;

@Entity
@Table(name = "student_Address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	
	@Column(length = 50, name = "CITY")
	private String city;

	@Column(name = "IS_OPEN")
	private boolean isOpen;

	@Transient
	private double x;

	@Temporal(TemporalType.DATE)
	
	private Date date1;
	public Address() {
		
	}

	public Address(int addressId, String city, boolean isOpen, double x, Date date1) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.date1 = date1;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double isX() {
		return x;
	}

	public void setX(double d) {
		this.x = d;
	}

	public Date getDate1() {
		return date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", isOpen=" + isOpen + ", x=" + x + ", date1="
				+ date1 + "]";
	}

}
