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

import com.paf.sellnbuy.dao.OrderDAO;
import com.paf.sellnbuy.model.Order;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/orders")
public class OrderController {
	
		@Autowired
		OrderDAO orderDAO;
		
		//Add an Order
		@PostMapping("/order")
	    public Order addOrder(@RequestBody Order order) {
			
			return orderDAO.save(order);
		}
	
	    //Get all Orders
		@GetMapping("/order")
		public List<Order> getOrders() {
			
			return orderDAO.findAll();
		}
		
		//Get an Order
		@GetMapping("/order/{oid}")
		public Order addOrder(@PathVariable("oid") int oid) {
			
			return orderDAO.findOne(oid);
		}
		
		//Delete an Order
		@DeleteMapping("/order/{cid}")
		public void deleteOrder(@PathVariable("cid") int cid) {
			
			orderDAO.delete(cid);
			
		}
		
		//Update an Order
		@PutMapping("/order")
		public Order updateOrder(@RequestBody Order order) {

			return orderDAO.update(order);
		}
	

}
