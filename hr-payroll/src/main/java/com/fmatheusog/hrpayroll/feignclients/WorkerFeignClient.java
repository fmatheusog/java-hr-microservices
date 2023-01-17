package com.fmatheusog.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.fmatheusog.hrpayroll.entities.Worker;

@Component
@FeignClient(name = "hr-worker", url = "localhost:8001", path = "/workers")
public interface WorkerFeignClient {
	@GetMapping
	ResponseEntity<Worker> findById(long id);
}
