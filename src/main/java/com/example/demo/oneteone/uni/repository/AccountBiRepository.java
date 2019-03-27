package com.example.demo.oneteone.uni.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.onetoone.unidirectional.Account;

public interface AccountBiRepository extends CrudRepository<Account, String>{

}
