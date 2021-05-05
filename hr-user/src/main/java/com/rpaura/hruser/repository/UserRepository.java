package com.rpaura.hruser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rpaura.hruser.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}