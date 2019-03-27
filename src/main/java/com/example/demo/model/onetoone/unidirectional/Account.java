package com.example.demo.model.onetoone.unidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account_uni")
public class Account {

	@Id
	private String id;
	private String accountNumber;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String id, String accountNumber) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
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
