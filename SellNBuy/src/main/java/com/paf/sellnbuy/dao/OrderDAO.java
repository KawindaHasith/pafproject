package com.paf.sellnbuy.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.paf.sellnbuy.model.Order;
import com.paf.sellnbuy.repository.OrderRepository;

@Service
public class OrderDAO {

	@Autowired
	OrderRepository orderRepo;
	
	    //Save an Order
		public Order save(Order order) {
			
			return orderRepo.save(order);
	    }
		
		//Search all Orders
		public List<Order> findAll() {
			
			return orderRepo.findAll();
		}
		
		//Get an Order
		public Order findOne(int id) {
			
			Optional<Order> op = orderRepo.findById(id);
			if (op.isPresent()) {
				
				return op.get();
				
			} else {

				return null;
				
			}
		}
		
		//Delete an Order
		public void delete(int id) {
			
			Order order = orderRepo.getOne(id);	
			Optional<Order> op = orderRepo.findById(id);
			
			if (op.isPresent()) {
				
				orderRepo.delete(order);
				
			} else {

				return;
				
			}
			
			
		}
		
		//Update an Order
		public Order update(Order order) {
			
			return orderRepo.save(order);
			
		}

	
}
