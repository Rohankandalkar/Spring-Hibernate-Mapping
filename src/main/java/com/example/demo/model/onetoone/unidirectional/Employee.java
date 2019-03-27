package com.example.demo.model.onetoone.unidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee_uni")
public class Employee {

	@Id
	private String id;
	private String name;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="account")
	private Account account;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String id, String name, Account account) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", account=" + account + "]";
	}

}
