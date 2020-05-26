package com.karadayi.kodstar.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Car extends  AbstractEntity{
	
	
	private String  chassisNumber;  
	private String  licencePlate;
	private String  servicePeriod;
	private String  brand;
	private String  model;
	private String  years;
	private String  enginType;
	private String  transmissionType;
	

	@OneToOne
	private Customer customer;
	
	@OneToOne
	private Maintenance maintenance;


	public String getChassisNumber() {
		return chassisNumber;
	}


	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}


	public String getLicencePlate() {
		return licencePlate;
	}


	public void setLicencePlate(String licencePlate) {
		this.licencePlate = licencePlate;
	}


	public String getServicePeriod() {
		return servicePeriod;
	}


	public void setServicePeriod(String servicePeriod) {
		this.servicePeriod = servicePeriod;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getYears() {
		return years;
	}


	public void setYears(String years) {
		this.years = years;
	}


	public String getEnginType() {
		return enginType;
	}


	public void setEnginType(String enginType) {
		this.enginType = enginType;
	}


	public String getTransmissionType() {
		return transmissionType;
	}


	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Maintenance getMaintenance() {
		return maintenance;
	}


	public void setMaintenance(Maintenance maintenance) {
		this.maintenance = maintenance;
	}


	



	
	
	
	
	

}
