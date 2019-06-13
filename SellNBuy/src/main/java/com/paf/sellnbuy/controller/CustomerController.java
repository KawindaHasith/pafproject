package com.paf.sellnbuy.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paf.sellnbuy.dao.CustomerDAO;
import com.paf.sellnbuy.model.Customer;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/customers", produces = {"application/json","application/xml"})
public class CustomerController {

	@Autowired
	CustomerDAO customerDAO;
	
	//Get all Customers
	@GetMapping("/customer")
	public List<Customer> getCustomers() {
		
		return customerDAO.findAll();
	}
	
	//Add a Customer
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		
		return customerDAO.save(customer);
	}
	
	//Get a Customer
	@GetMapping("/customer/{cid}")
	public Customer getCustomer(@PathVariable("cid") int cid) {
		
		return customerDAO.findOne(cid);
	}
	
	//Delete a Customer
	@DeleteMapping("/customer/{cid}")
	public void deleteCustomer(@PathVariable("cid") int cid) {
		
		customerDAO.delete(cid);
		
	}
	
	//Update a Customer
	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer customer) {

		return customerDAO.update(customer);
	}
	
}
