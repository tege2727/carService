package com.karadayi.kodstar.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.karadayi.kodstar.dto.MaintenanceRequest;
import com.karadayi.kodstar.entities.*;
import com.karadayi.kodstar.repos.MaintenanceRepositoryDao;
import com.karadayi.kodstar.repos.MaintenanceUpdateRepositoryDao;
import com.karadayi.kodstar.service.MaintenanceService;

import com.karadayi.kodstar.repos.CarRepositoryDao;


@Controller
public class MaintenanceController {
	
	//Loglama için
	private static final  Logger logger= LoggerFactory.getLogger(MaintenanceController.class);
	
	
	@Autowired
	MaintenanceService maintenanceService;
	
	@Autowired
	CarRepositoryDao carRepositoryDao;
	
	@Autowired
	MaintenanceRepositoryDao maintenanceRepositoryDao;
	
	@Autowired
	MaintenanceUpdateRepositoryDao maintenanceUpdateRepositoryDao;
	
	
	@RequestMapping(value = "/saveMaintenance", method = RequestMethod.GET)
	public String saveMaintenance(@ModelAttribute("Maintenance") MaintenanceRequest maintenanceRequest,ModelMap modelMap    ) {
		logger.info("You are now in saveMaintenance() method with maintenance : "+maintenanceRequest);
		
	     Maintenance saveMaintenace = maintenanceService.saveMaintenace(maintenanceRequest);
				
		 List<MaintenanceUpdateRequest> maintenanceByCar = maintenanceUpdateRepositoryDao.findAll();
									
		
		Car car = saveMaintenace.getCar();
		
		logger.info("You are now in saveMaintenance() method with maintenance : "+maintenanceByCar);
		
		modelMap.addAttribute("maintenanceByCar", maintenanceByCar);
		
		modelMap.addAttribute("car", car);
		
		return "showSavedMaintenanceWithCar";
	}
	

	
	
	
	
	
	@RequestMapping("updateMaintenance")
	public String updateMaintenance(@ModelAttribute("Maintenance") MaintenanceRequest maintenance,
			ModelMap modelMap){
		
		logger.info("You are now in updateMaintenance() method with maintenance id : "+maintenance.getMaintenanceId());
		logger.info("You are now in updateMaintenance() method with car id : "+maintenance.getCarId());
		
			
		  Car car = carRepositoryDao.findById(maintenance.getCarId()).get();//Bakımdaki Araba bilgileri getirildi
		  
		  maintenanceService.updateMaintenance(maintenance);//Bakım güncellemeler yapıldı.
		  
		 //List<Maintenance> maintenanceByCar =maintenanceRepositoryDao.findByCar(car);//Bu arabaya ait tüm bakımlar getirildi..
		 
		  
		  List<MaintenanceUpdateRequest> maintenanceByCar = maintenanceUpdateRepositoryDao.findByCar(car);//Bu arabaya ait tüm bakımlar getirildi..
		  
		  modelMap.addAttribute("maintenanceByCar", maintenanceByCar);
		  
		  logger.info("You are now in updateMaintenance() method.Maintenance informations are : "+maintenanceByCar);
		  logger.info("You are now in updateMaintenance() method.Car informations are : "+car) ;
		  
		  modelMap.addAttribute("car",car);
		 	 
		
		
		return "showSavedMaintenanceWithCar";
	}
	
	
	
	
	@RequestMapping("findMaintenance")
	public String findMaintanence(@RequestParam("chassisNumber") String chassisNumber,@RequestParam("licencePlate") String licencePlate,
			ModelMap modelMap){
		
		List<Car> cars = carRepositoryDao.findCars(chassisNumber, licencePlate);
		
		logger.info("You are now in findMaintanence() method with chassisNumber : "+chassisNumber+"licencePlate: "+licencePlate);
					
		modelMap.addAttribute("cars", cars);
		
		return "displayCars";
	}
	
	
	@RequestMapping("findMaintanenceById")
	public String findMaintanenceById(@RequestParam("maintenanceId") Long maintenanceId,
			ModelMap modelMap){
		
		Maintenance savedMaintenance = maintenanceRepositoryDao.findById(maintenanceId).get();
							
		Car saveCarWithCustomerDetails = savedMaintenance.getCar();
		
		logger.info("You are now in findMaintanenceById() method with maintenance id : "+maintenanceId);
					
		modelMap.addAttribute("savedMaintenance", savedMaintenance);
		
		modelMap.addAttribute("saveCarWithCustomerDetails", saveCarWithCustomerDetails);
		
		
		return "updateMaintanencePage";
	}
	
	
	
	
	
	
	@RequestMapping("showMaintenance")
	public String showMaintenance(@RequestParam("cartId") Long cartId,ModelMap modelMap){
		
		Car car = carRepositoryDao.findById(cartId).get();
	
		//List<Maintenance> maintenanceByCar = maintenanceRepositoryDao.findByCar(car);
		
		List<MaintenanceUpdateRequest> maintenanceByCar = maintenanceUpdateRepositoryDao.findByCar(car);
		
		modelMap.addAttribute("car", car);
		modelMap.addAttribute("maintenanceByCar", maintenanceByCar);
		return "showSavedMaintenanceWithCar";
		
	}
	
	
	@RequestMapping("saveNewMaintenanceWithCurrentWithCar")
	public String saveNewMaintenanceWithCurrentWithCar(@RequestParam("cartId") Long cartId,ModelMap modelMap){
		
		Car saveCarWithCustomerDetails = carRepositoryDao.findById(cartId).get();
		
		modelMap.addAttribute("saveCarWithCustomerDetails", saveCarWithCustomerDetails);
		return "maintanencePage";
		
	}
	
	
	@RequestMapping("deleteMaintanenceById")
	public String deleteMaintanenceById(@RequestParam("maintenanceId") Long maintenanceId,ModelMap modelMap){
		
			
		Maintenance maintenance = maintenanceRepositoryDao.findById(maintenanceId).get();
		Car car = maintenance.getCar();
		
		maintenanceRepositoryDao.deleteById(maintenanceId);
		
		List<MaintenanceUpdateRequest> maintenanceByCar = maintenanceUpdateRepositoryDao.findAll();
				
		modelMap.addAttribute("car", car);
		modelMap.addAttribute("maintenanceByCar", maintenanceByCar);
		
	
		return "showSavedMaintenanceWithCar";
	}
	
	
	

}
