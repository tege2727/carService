package com.karadayi.kodstar.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karadayi.kodstar.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
  User findByEmail(String email);
	
}
