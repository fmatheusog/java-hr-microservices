package com.fmatheusog.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmatheusog.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
	
}
