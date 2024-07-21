package com.biswa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "brand")
public class Brand {
	@Id
	@Column(name = "b_id")
	private int bId;
	
	@Column(name = "p_id")
	private int pId;
	
	@Column(name = "brand_name")
	private String brandName;

}
