package com.paf.sellnbuy.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paf.sellnbuy.model.Payment;
import com.paf.sellnbuy.repository.PaymentRepository;

@Service
public class PaymentDAO {

	@Autowired
	PaymentRepository paymentRepo;
	
	//Save a Payment
	public Payment save(Payment payment) {
		
		return paymentRepo.save(payment);
	}
	
	//Search all Payments
	public List<Payment> findAll() {
		
		return paymentRepo.findAll();
	}
	
	//Get a Payment
	public Payment findOne(int id) {
		
		Optional<Payment> op = paymentRepo.findById(id);
		if (op.isPresent()) {
			
			return op.get();
			
		} else {

			return null;
			
		}
	}
	
	//Delete a Payment
	public void delete(int id) {
		
		Payment payment = paymentRepo.getOne(id);
		Optional<Payment> op = paymentRepo.findById(id);
		
		if (op.isPresent()) {
			
			paymentRepo.delete(payment);
			
		} else {

			return;
			
		}
		
		
	}
	
	//Update a Payment
	public Payment update(Payment payment) {
		
		return paymentRepo.save(payment);
		
	}
}
