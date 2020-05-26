package com.karadayi.kodstar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.karadayi.kodstar.service.*;

import com.karadayi.kodstar.dto.CustomerRequest;
import com.karadayi.kodstar.entities.Car;

@Controller
public class CustomerController {
	
	//Loglama için
	private static final  Logger logger= LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	CarService  carService;
	  
	
	
	@RequestMapping(value ="/saveCustomerWithCar",method = RequestMethod.POST)
	public String saveCustomerWithCar(CustomerRequest customerRequest,ModelMap modelMap) {
		
		logger.info("You are now in saveCustomerWithCar() method with customer : "+customerRequest);
		
		Car saveCarWithCustomerDetails = carService.saveCarWithCustomerDetails(customerRequest);
		
		logger.info("You are now in saveCustomerWithCar() method with customer : "+saveCarWithCustomerDetails);
		
		modelMap.addAttribute("saveCarWithCustomerDetails", saveCarWithCustomerDetails);
		
		return "maintanencePage";
	}
	
	@RequestMapping("showCustomerWithCar")
	public String showCustomerWithCar(){
		
		logger.info("You are now in showCustomerWithCar() method  ");
		
		return "saveCustomerWithCar";
	}
	
	
	
	
	
	
}
