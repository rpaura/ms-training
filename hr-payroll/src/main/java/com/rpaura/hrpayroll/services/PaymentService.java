package com.rpaura.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;

import com.rpaura.hrpayroll.entities.Payment;
import com.rpaura.hrpayroll.entities.Worker;
import com.rpaura.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	@LoadBalanced
	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPayment(long workerId, int days) {

		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
