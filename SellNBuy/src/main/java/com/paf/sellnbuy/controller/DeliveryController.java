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

import com.paf.sellnbuy.dao.DeliveryDAO;
import com.paf.sellnbuy.model.Delivery;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/deliveries")
public class DeliveryController {

	@Autowired
	DeliveryDAO deliveryDAO;
	
	//Get all Deliveries
	@GetMapping("/delivery")
	public List<Delivery> getDelivery() {
		
		return deliveryDAO.findAll();
	}
	
	//Add a Delivery
	@PostMapping("/delivery")
	public Delivery addDelivery(@RequestBody Delivery delivery) {
		
		return deliveryDAO.save(delivery);
	}
	
	//Get a Delivery
	@GetMapping("/delivery/{id}")
	public Delivery getDelivery(@PathVariable("id") int pid) {
		
		return deliveryDAO.findOne(pid);
	}
	
	//Delete a Delivery
	@DeleteMapping("/delivery/{id}")
	public void deleteDelivery(@PathVariable("id") int pid) {
		
		deliveryDAO.delete(pid);
		
	}
	
	//Update a Delivery
	@PutMapping("/delivery")
	public Delivery updateDelivery(@RequestBody Delivery delivery) {

		return deliveryDAO.update(delivery);
	}
	
}
