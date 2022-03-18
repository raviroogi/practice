package com.test.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.Entity.shopEntity;
@Repository

public interface shopRepo extends JpaRepository<shopEntity, Long>{

	//shopEntity findByshopName(String name);

	shopEntity findByshopName(String name);

	//shopEntity findByName(String name);

}
