package com.biswa.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biswa.entity.Customer;

import jakarta.persistence.EntityManager;

@RestController
public class KartController {

	@Autowired
	EntityManager entityManager;
	
	@GetMapping("/products")
	public Customer getProductByCustomer() {
		return entityManager.find(Customer.class, 1);
	}
	
	@GetMapping("/")
	public String home() {
		return "Home Page";
	}
}
