package com.example.demo.service.onetomany;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.onetomany.AccountEntity;
import com.example.demo.model.onetomany.EmployeeEntity;
import com.example.demo.onetemany.repository.EmployeeEntityRepository;

@Service
public class EmployeeServiceOneToMany {

	@Autowired
	private EmployeeEntityRepository employeeEntityRepository;

	public void save() {

		AccountEntity account1 = new AccountEntity();
		account1.setId("1");
		account1.setBankName("BOI");
		account1.setNumber("789456123");

		AccountEntity account2 = new AccountEntity();
		account2.setId("2");
		account2.setBankName("SBI");
		account2.setNumber("123456789");

		Set<AccountEntity> accountEntities1 = new HashSet<AccountEntity>();
		accountEntities1.add(account1);

		Set<AccountEntity> accountEntities2 = new HashSet<AccountEntity>();
		accountEntities1.add(account2);

		EmployeeEntity employee1 = new EmployeeEntity();
		employee1.setId("1");
		employee1.setName("sham");
		employee1.setAccountEntityes(accountEntities1);

		EmployeeEntity employee2 = new EmployeeEntity();
		employee2.setId("2");
		employee2.setName("ram");
		employee2.setAccountEntityes(accountEntities2);

		employeeEntityRepository.save(employee1);
		employeeEntityRepository.save(employee2);

	}

}
