package com.example.demo.model.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="account_entity")
public class AccountEntity {

	@Id
	private String id;
	private String number;
	private String bankName;

	@ManyToOne
	private EmployeeEntity employeeEntity;

	public AccountEntity() {
		// TODO Auto-generated constructor stub
	}

	public AccountEntity(String id, String number, String bankName) {
		super();
		this.id = id;
		this.number = number;
		this.bankName = bankName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "AccountEntity [id=" + id + ", number=" + number + ", bankName=" + bankName + "]";
	}

}
