package com.biswa.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {

	@Id
	@Column(name = "p_id")
	private int id;

	@Column(name = "p_name")
	private String pName;

	private String price;

	private String rating;
	
	@Column(name = "c_id")
	private int cId;
	
	@OneToMany(targetEntity = Brand.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "p_id", referencedColumnName = "p_id")
	private List<Brand> brands;
	
}
