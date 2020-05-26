package com.karadayi.kodstar.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karadayi.kodstar.entities.Maintenance;
import com.karadayi.kodstar.entities.Car;
import java.util.List;

public interface MaintenanceRepositoryDao extends JpaRepository<Maintenance, Long> {
	
	List<Maintenance> findByCar(Car car);
	
	
	

}
