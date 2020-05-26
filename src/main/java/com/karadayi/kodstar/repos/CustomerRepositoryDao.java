package com.karadayi.kodstar.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karadayi.kodstar.entities.Customer;

public interface CustomerRepositoryDao extends JpaRepository<Customer, Long> {
	

}
