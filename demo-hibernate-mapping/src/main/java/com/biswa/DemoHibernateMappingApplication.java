package com.biswa;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.biswa.entity.Brand;
import com.biswa.entity.Customer;
import com.biswa.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Transactional
@SpringBootApplication
public class DemoHibernateMappingApplication implements CommandLineRunner{
	@Autowired
	EntityManager entityManager;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoHibernateMappingApplication.class, args);
		System.out.println("Hello Spring Boot - Hibernate Mapping..");
		String data = StringUtils.leftPad("123", 10, "0");
		System.out.println(StringUtils.uncapitalize("biswa ranjan mohapatra"));
		System.out.println("Biswa - "+data);
	}

	@Override
	public void run(String... args) throws Exception {
		Customer customer=new Customer();
		customer.setId(2);
		customer.setFirstName("Biswaranjan");
		customer.setLastName("Mohapatra");
		customer.setMailId("baditri1983@gmail.com");
		customer.setMobile("7008399210");
		//entityManager.persist(customer);
		
//		Product product =new Product();
//		product.setId(1113);
//		product.setPName("Mobile");
//		product.setPrice("40000");
//		product.setRating("5");
//		product.setCId(1);
//		entityManager.persist(product);
//		System.out.println("Save Data Success..");
		
//		Brand brand= new Brand();
//		brand.setBId(2222);
//		brand.setPId(1111);
//		brand.setBrandName("LG");
//		entityManager.persist(brand);
	}
}
