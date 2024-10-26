package com.biswa.customer;

import org.springframework.data.repository.CrudRepository;

public interface CustomerDao extends CrudRepository<Customer, CustomerKey>{

}
