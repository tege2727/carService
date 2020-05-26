package com.karadayi.kodstar.dto;

public class CustomerRequest {
	

	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String adress;
	
	
	private String  chassisNumber;  
	private String  licencePlate;
	private String  brand;
	private String  model;
	private String  years;
	private String  enginType;
	private String  servicePeriod;
	private String  transmissionType;
	
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
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
	public String getServicePeriod() {
		return servicePeriod;
	}
	public void setServicePeriod(String servicePeriod) {
		this.servicePeriod = servicePeriod;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getTransmissionType() {
		return transmissionType;
	}
	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}
	@Override
	public String toString() {
		return "CustomerRequest [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phone="
				+ phone + ", adress=" + adress + ", chassisNumber=" + chassisNumber + ", licencePlate=" + licencePlate
				+ ", brand=" + brand + ", model=" + model + ", years=" + years + ", enginType=" + enginType
				+ ", servicePeriod=" + servicePeriod + ", transmissionType=" + transmissionType + "]";
	}
	
	
	
	

}
