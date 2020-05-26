package com.karadayi.kodstar.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karadayi.kodstar.entities.*;
import com.karadayi.kodstar.entities.Car;
import java.util.List;

public interface MaintenanceUpdateRepositoryDao extends JpaRepository<MaintenanceUpdateRequest, Long> {
	
	List<MaintenanceUpdateRequest> findByCar(Car car);

}
