package com.example.demo.oneteone.bid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.onetoone.bidirectional.Account;

public interface AccountUniRepository extends JpaRepository<Account, String> {

}
