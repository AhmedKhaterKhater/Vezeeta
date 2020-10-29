package khater.vezeeta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hospital")
public class Hospital {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name="id")
	private int id;
	
	@Column(name="hospital_name")
	private String name;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	public int getId() {
		return id;
	}
	
	public Hospital()
	{
		
	}

	public Hospital(int id, String name, String street, String city) {
		super();
		this.id = id;
		this.name = name;
		this.street = street;
		this.city = city;
	}



	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", street=" + street + ", city=" + city + "]";
	}
	
	
	
}
