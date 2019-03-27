package com.example.demo.service.onetoone.bidirection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.onetoone.bidirectional.Account;
import com.example.demo.model.onetoone.bidirectional.Employee;
import com.example.demo.oneteone.bid.repository.EmployeeUniRepository;

@Service
public class EmployeeBidService {

	@Autowired
	private EmployeeUniRepository employeeRepository;

	public void add() {

		Account account = new Account();
		account.setId("1");
		account.setAccountNumber("acc_1");

		Employee emp = new Employee();
		emp.setId("1");
		emp.setName("sham");
		emp.setAccount(account);

		employeeRepository.save(emp);

	}
}
