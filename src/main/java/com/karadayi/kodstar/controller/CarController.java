package com.karadayi.kodstar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.karadayi.kodstar.dto.CustomerRequest;
import com.karadayi.kodstar.entities.Car;
import com.karadayi.kodstar.repos.CarRepositoryDao;


@Controller
public class CarController {
	
	 
	@Autowired
	CarRepositoryDao carRepositoryDao;
	
	//Loglama için
	 private static final  Logger logger= LoggerFactory.getLogger(UserController.class);
	
	 
	
	@RequestMapping("findCar")
	public String findCar(){
		
		logger.info("You are now in findCar() method." );
		
				
		return "findMaintenance";
	}

}
