package com.test.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.Entity.shopAvailabilityEntity;

@Repository

public interface ShopAvailibityrepo extends JpaRepository<shopAvailabilityEntity, Long> {

}
