package com.biswa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;

@Repository
public class KartRepository {

	@Autowired
	EntityManager entityManager;
	
}
