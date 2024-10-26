package com.biswa.customer;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	CustomerDao dao;

	@PostMapping("/saveCustomer")
	public String saveCustomer(@RequestBody Customer customer) {
		customer.setCreatedBy("biswa");
		customer.setCreatedDate(LocalDateTime.now());
		dao.save(customer);
		return "Save Success";
	}

	@GetMapping("/findCustomer/{customerId}/{orderId}")
	public Optional<Customer> getCustomerById(@PathVariable Long customerId, @PathVariable Long orderId) {
		return dao.findById(new CustomerKey(customerId, orderId));
	}

	@GetMapping("/findCustomers")
	public Iterable<Customer> getCustomers() {
		return dao.findAll();
	}
}
