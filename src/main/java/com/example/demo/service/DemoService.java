package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.onetoone.unidirectional.Account;
import com.example.demo.model.onetoone.unidirectional.Employee;
import com.example.demo.oneteone.uni.repository.EmployeeBiRepository;

@Service
public class DemoService {

	@Autowired
	private EmployeeBiRepository employeeRepository;

	public void add() {

		Account account = new Account();
		account.setId("1");
		account.setAccountNumber("1524");

		Employee employee = new Employee();
		employee.setId("emp1");
		employee.setName("ram");
		employee.setAccount(account);

		employeeRepository.save(employee);

	}

}
