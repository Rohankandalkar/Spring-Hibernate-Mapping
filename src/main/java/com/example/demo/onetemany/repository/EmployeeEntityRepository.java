package com.example.demo.onetemany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.onetomany.EmployeeEntity;

public interface EmployeeEntityRepository extends JpaRepository<EmployeeEntity, String> {

}
