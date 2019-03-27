package com.example.demo.model.onetomany;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee_entity")
public class EmployeeEntity {

	@Id
	private String id;
	private String name;

	@OneToMany
	private Set<AccountEntity> accountEntityes;

	public EmployeeEntity() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeEntity(String id, String name, Set<AccountEntity> accountEntityes) {
		super();
		this.id = id;
		this.name = name;
		this.accountEntityes = accountEntityes;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<AccountEntity> getAccountEntityes() {
		return accountEntityes;
	}

	public void setAccountEntityes(Set<AccountEntity> accountEntityes) {
		this.accountEntityes = accountEntityes;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", accountEntityes=" + accountEntityes + "]";
	}

}
