package com.karadayi.kodstar.entities;


import javax.persistence.Entity;

import javax.persistence.OneToOne;

@Entity
public class Maintenance extends AbstractEntity{
	
	

	private String comments;
	private String processDetails;
	private String processKm;
	
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
	
	@Override
	public String toString() {
		return "Maintenance [comments=" + comments + ", processDetails=" + processDetails + ", processKm=" + processKm
				+ ", car=" + car + ", customer=" + customer + "]";
	}
	
	

}
