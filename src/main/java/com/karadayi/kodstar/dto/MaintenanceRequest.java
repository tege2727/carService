package com.karadayi.kodstar.dto;

import java.util.Date;

public class MaintenanceRequest {
	
	private String comments;
	private String processDetails;
	private String processKm;
	
	private Long carId;
	private Long customerId;
	private Long maintenanceId;

	
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

	
	public Long getCarId() {
		return carId;
	}
	public void setCarId(Long carId) {
		this.carId = carId;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	
	@Override
	public String toString() {
		return "MaintenanceRequest [comments=" + comments + ", processDetails=" + processDetails + ", processKm="
				+ processKm + ", carId=" + carId + ", customerId=" + customerId + "]";
	}
	public Long getMaintenanceId() {
		return maintenanceId;
	}
	public void setMaintenanceId(Long maintenanceId) {
		this.maintenanceId = maintenanceId;
	}
	
	
	

}
