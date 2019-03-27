package com.example.demo.oneteone.bid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.onetoone.bidirectional.Employee;

public interface EmployeeUniRepository extends JpaRepository<Employee, String>{

}
