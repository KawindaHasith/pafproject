package com.paf.sellnbuy.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paf.sellnbuy.model.Customer;
import com.paf.sellnbuy.repository.CustomerRepository;

@Service
public class CustomerDAO {
	
	@Autowired
	CustomerRepository customerRepo;
	
	//Save a Customer
	public Customer save(Customer customer) {
		
		return customerRepo.save(customer);
	}
	
	//Search all Customers
	public List<Customer> findAll() {
		
		return customerRepo.findAll();
	}
	
	//Get a Customer
	public Customer findOne(int id) {
		
		Optional<Customer> op = customerRepo.findById(id);
		if (op.isPresent()) {
			
			return op.get();
			
		} else {

			return null;
			
		}
	}
	
	//Delete a Customer
	public void delete(int id) {
		
		Customer customer = customerRepo.getOne(id);	
		Optional<Customer> op = customerRepo.findById(id);
		
		if (op.isPresent()) {
			
			customerRepo.delete(customer);
			
		} else {

			return;
			
		}
		
		
	}
	
	//Update a Customer
	public Customer update(Customer customer) {
		
		return customerRepo.save(customer);
		
	}
	

}
