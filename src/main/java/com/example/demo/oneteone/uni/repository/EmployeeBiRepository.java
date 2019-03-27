package com.example.demo.oneteone.uni.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.onetoone.unidirectional.Employee;

public interface EmployeeBiRepository extends CrudRepository<Employee, String>{

}
