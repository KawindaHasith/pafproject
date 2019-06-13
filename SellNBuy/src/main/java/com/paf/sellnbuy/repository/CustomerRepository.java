package com.paf.sellnbuy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.paf.sellnbuy.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
