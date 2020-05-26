package com.karadayi.kodstar.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.karadayi.kodstar.entities.Car;
import com.karadayi.kodstar.entities.Customer;

@Entity
@Table(name = "maintenance")
public class MaintenanceUpdateRequest extends AbstractEntity {
	
	
	private String comments;
	private String processDetails;
	private String processKm;
	
	private Date created;//entitiesten farklı olan parametre.Veritabanında otomatik oluşturuluyor.
	
	
	@OneToOne
	private Car car;
	
	@OneToOne
	private Customer customer;

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getProcessDetails() {
		return processDetails;
	}

	public void setProcessDetails(String processDetails) {
		this.processDetails = processDetails;
	}

	public String getProcessKm() {
		return processKm;
	}

	public void setProcessKm(String processKm) {
		this.processKm = processKm;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	

}
