package com.paf.sellnbuy.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paf.sellnbuy.model.Delivery;
import com.paf.sellnbuy.repository.DeliveryRepository;

@Service
public class DeliveryDAO {
	
	@Autowired
	DeliveryRepository deliveryRepo;
	
	//Save a Delivery
	public Delivery save(Delivery delivery) {
		
		return deliveryRepo.save(delivery);
	}
	
	//Search all Deliveries
	public List<Delivery> findAll() {
		
		return deliveryRepo.findAll();
	}
	
	//Get a Delivery
	public Delivery findOne(int id) {
		
		Optional<Delivery> op = deliveryRepo.findById(id);
		
		if (op.isPresent()) {
			
			return op.get();
			
		} else {

			return null;
			
		}
	}
	
	//Delete a Delivery
	public void delete(int id) {
		
		Delivery delivery = deliveryRepo.getOne(id);
		Optional<Delivery> op = deliveryRepo.findById(id);
		
		if (op.isPresent()) {
			
			deliveryRepo.delete(delivery);
			
		} else {

			return;
			
		}
		
		
	}
	
	//Update a Delivery
	public Delivery update(Delivery delivery) {
		
		return deliveryRepo.save(delivery);
		
	}
}
