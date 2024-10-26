package com.biswa.customer;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CustomerKey implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "CUSTOMER_ID")
	private Long customerId;
	
	@Column(name = "ORDER_ID")
	private Long orderId;

}
