package com.karadayi.kodstar.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.karadayi.kodstar.entities.Car;
import java.lang.String;

public interface CarRepositoryDao extends JpaRepository<Car, Long> {

	@Query("from Car where chassisNumber=:chassisNumber or licencePlate=:licencePlate")
	List<Car> findCars(@Param("chassisNumber") String chassisNumber, @Param("licencePlate") String licencePlate);
	

	
	
	List<Car> findByChassisNumber(String chassisnumber);

	
}
