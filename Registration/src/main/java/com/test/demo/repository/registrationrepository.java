package com.test.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.Entity.registrationEntity;
@Repository

public interface registrationrepository extends JpaRepository<registrationEntity, Long>{

}
