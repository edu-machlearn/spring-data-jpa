package com.biswa.customer;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Customer extends BaseEntity{
	
	@EmbeddedId
	private CustomerKey id;
	
	private String name;
	private double amount;

}
