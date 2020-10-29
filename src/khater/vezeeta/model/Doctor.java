package khater.vezeeta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {
	
	public Doctor() {
		
	}
	
	
	public Doctor( int age, String name, String ssn, String specialization, String street, String city) {
		
		this.age = age;
		this.name = name;
		this.ssn = ssn;
		this.specialization = specialization;
		this.street = street;
		this.city = city;
	}
	
	
	@Column(name="age")
	private int age;
	
	@Column(name="name")
	private String name;
	
	@Id
	@Column(name="ssn")
	private String ssn;
	
	@Column(name="specialization")
	private String specialization;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
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
		return "Doctor [ age=" + age + ", name=" + name + ", ssn=" + ssn + ", specialization="
				+ specialization + ", street=" + street + ", city=" + city + "]";
	}
	
	
	
	

}
