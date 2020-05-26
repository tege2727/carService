package com.karadayi.kodstar.service;

import com.karadayi.kodstar.dto.CustomerRequest;
import com.karadayi.kodstar.entities.Car;


public interface CarService {
	
	public Car saveCarWithCustomerDetails(CustomerRequest newCustomerRequest);
	
	
	

}
