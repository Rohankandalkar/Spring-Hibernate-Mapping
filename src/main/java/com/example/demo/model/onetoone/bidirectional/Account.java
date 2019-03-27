package com.example.demo.model.onetoone.bidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="account_bid")
public class Account {

	@Id
	private String id;
	private String accountNumber;

	@OneToOne(mappedBy="account")
	private Employee employee;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String id, String accountNumber, Employee employee) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + "]";
	}

}
