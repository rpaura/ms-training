package com.rpaura.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rpaura.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

	
}
