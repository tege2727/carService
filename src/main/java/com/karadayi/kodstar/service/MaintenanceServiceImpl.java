package com.karadayi.kodstar.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.karadayi.kodstar.dto.MaintenanceRequest;
import com.karadayi.kodstar.entities.Car;
import com.karadayi.kodstar.entities.Customer;
import com.karadayi.kodstar.entities.Maintenance;
import com.karadayi.kodstar.entities.MaintenanceUpdateRequest;
import com.karadayi.kodstar.repos.CarRepositoryDao;
import com.karadayi.kodstar.repos.CustomerRepositoryDao;
import com.karadayi.kodstar.repos.MaintenanceRepositoryDao;
import com.karadayi.kodstar.repos.MaintenanceUpdateRepositoryDao;
import com.karadayi.kodstar.util.PDFGenerator;
import com.karadayi.kodstar.util.EmailUtil;

@Service
public class MaintenanceServiceImpl implements MaintenanceService {
	
	@Autowired
	MaintenanceRepositoryDao maintenanceRepositoryDao;
	
	@Autowired
	MaintenanceUpdateRepositoryDao maintenanceUpdateRepositoryDao;
	
	@Autowired
	CarRepositoryDao  carRepositoryDao;
	
	@Autowired
	CustomerRepositoryDao customerRepositoryDao;
		
	private static final Logger LOGGER=LoggerFactory.getLogger(MaintenanceServiceImpl.class);
	
	@Value("${com.karadayi.kodstar.itinerary.dirpath}")   //Bu satır için application.properties'e bak.
	private  String ITINERARY_DIR;
	
	@Autowired
	PDFGenerator PDFGenerator;
	
	
	@Autowired
	EmailUtil EmailUtil;
	

	@Override
	@Transactional
	public Maintenance saveMaintenace(MaintenanceRequest maintenanceRequest) {
		// TODO Auto-generated method stub
		
	    Car car = carRepositoryDao.findById(maintenanceRequest.getCarId()).get();
		Customer customer = customerRepositoryDao.findById(maintenanceRequest.getCustomerId()).get();
		
		Maintenance maintenance=new Maintenance();
		
		maintenance.setCar(car);
		maintenance.setCustomer(customer);
		
		maintenance.setComments(maintenanceRequest.getComments());
		maintenance.setProcessDetails(maintenanceRequest.getProcessDetails());
		maintenance.setProcessKm(maintenanceRequest.getProcessKm());
		
		Maintenance savedMaintenance = maintenanceRepositoryDao.save(maintenance);
		
		
		String filePath=ITINERARY_DIR+savedMaintenance.getId()+".pdf";
		
		LOGGER.info("Generating the itinerary as a pdf");
		PDFGenerator.GenerateItenary(savedMaintenance, filePath);
		
		LOGGER.info("Sending Email with Maintenance ");
		EmailUtil.sendMaintenance(savedMaintenance.getCustomer().getEmail(), filePath);
		
		return savedMaintenance;
	}
	
	
	public MaintenanceUpdateRequest updateMaintenance(MaintenanceRequest maintenance) {
		
		MaintenanceUpdateRequest savedMaintenance = maintenanceUpdateRepositoryDao.findById(maintenance.getMaintenanceId()).get();
		
		savedMaintenance.setComments(maintenance.getComments());
		savedMaintenance.setProcessDetails(maintenance.getProcessDetails());
		savedMaintenance.setProcessKm(maintenance.getProcessKm());
		
		MaintenanceUpdateRequest updatedMaintenance = maintenanceUpdateRepositoryDao.save(savedMaintenance);
		
		
		return updatedMaintenance;
	}
	

}
