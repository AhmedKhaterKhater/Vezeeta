package khater.vezeeta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clinic")
public class Clinic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name="id")
	private int id;
	
	@Column(name="clinic_name")
	private String clinic_name;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	
	@Column(name="ticket")
	private int ticket;
	
	@Column(name="starting_time")
	private int startingTime;
	
	@Column(name="terminating_time")
	private int terminatingTime;
	
	
		
	public Clinic(int id, String cliName, String street, String city, int ticketPrice, int startingTime,
			int terminatingTime) {
		super();
		this.id = id;
		this.clinic_name = cliName;
		this.street = street;
		this.city = city;
		this.ticket = ticketPrice;
		this.startingTime = startingTime;
		this.terminatingTime = terminatingTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClinicName() {
		return clinic_name;
	}
	public void setClinicName(String cliName) {
		this.clinic_name = cliName;
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
	public int getTicket() {
		return ticket;
	}
	public void setTicket(int ticket) {
		this.ticket = ticket;
	}
	public int getStartingTime() {
		return startingTime;
	}
	public void setStartingTime(int startingTime) {
		this.startingTime = startingTime;
	}
	public int getTerminatingTime() {
		return terminatingTime;
	}
	public void setTerminatingTime(int terminatingTime) {
		this.terminatingTime = terminatingTime;
	}
	@Override
	public String toString() {
		return "Clinic [id=" + id + ", cliName=" + clinic_name + ", street=" + street + ", city=" + city + ", ticketPrice="
				+ ticket + ", startingTime=" + startingTime + ", terminatingTime=" + terminatingTime + "]";
	}
	
	
	

}
