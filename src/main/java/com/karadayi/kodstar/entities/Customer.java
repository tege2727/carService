package com.karadayi.kodstar.entities;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Customer extends AbstractEntity {
	

	private String adress;
	private String email;
	private String firstName;
	private String lastName;
	private String phone;
	

	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Customer [adress=" + adress + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phone=" + phone + "]";
	}
	
	
	


}
