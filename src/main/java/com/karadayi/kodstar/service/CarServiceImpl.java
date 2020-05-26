package com.karadayi.kodstar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karadayi.kodstar.dto.CustomerRequest;
import com.karadayi.kodstar.entities.Car;
import com.karadayi.kodstar.entities.Customer;
import com.karadayi.kodstar.repos.CarRepositoryDao;
import com.karadayi.kodstar.repos.CustomerRepositoryDao;


@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	CarRepositoryDao carRepositoryDao;
	
	
	@Autowired
	CustomerRepositoryDao customerRepositoryDao;
	

	@Override
	public Car saveCarWithCustomerDetails(CustomerRequest newCustomer) {
		// TODO Auto-generated method stub
		
		Customer customer=new Customer();
		customer.setFirstName(newCustomer.getFirstName());
		customer.setLastName(newCustomer.getLastName());
		customer.setAdress(newCustomer.getAdress());
		customer.setPhone(newCustomer.getPhone());
		customer.setEmail(newCustomer.getEmail());
		
		Customer savedCustomer = customerRepositoryDao.save(customer);
		
		
		Car car=new Car();
		car.setBrand(newCustomer.getBrand());
		car.setChassisNumber(newCustomer.getChassisNumber());
		car.setEnginType(newCustomer.getEnginType());
		car.setLicencePlate(newCustomer.getLicencePlate());
		car.setModel(newCustomer.getModel());
		car.setServicePeriod(newCustomer.getServicePeriod());
		car.setTransmissionType(newCustomer.getTransmissionType());
		car.setYears(newCustomer.getYears());
		car.setCustomer(savedCustomer);
		
		Car savedCar = carRepositoryDao.save(car);
		
		return savedCar;
	}

	

}
