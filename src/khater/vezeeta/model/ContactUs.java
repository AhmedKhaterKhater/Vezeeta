package khater.vezeeta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact_us")
public class ContactUs {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="email")
	private String email;
	
	
	@Column(name="comment")
	private String comment;
	
	
	
	
	
	
	public int getId() {
		return id;
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






	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}






	public String getEmail() {
		return email;
	}






	public void setEmail(String email) {
		this.email = email;
	}






	public String getComment() {
		return comment;
	}






	public void setComment(String comment) {
		this.comment = comment;
	}






	@Override
	public String toString() {
		return "ContactUs [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", comment="
				+ comment + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
