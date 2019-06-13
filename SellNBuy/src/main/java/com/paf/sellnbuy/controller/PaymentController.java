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

import com.paf.sellnbuy.dao.PaymentDAO;
import com.paf.sellnbuy.model.Payment;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/payments")
public class PaymentController {
	
	@Autowired
	PaymentDAO paymentDAO;
	
	//Get all Payments
	@GetMapping("/payment")
	public List<Payment> getPayments() {
		
		return paymentDAO.findAll();
	}
	
	//Add a Payment
	@PostMapping("/payment")
	public Payment addPayment(@RequestBody Payment payment) {
		
		return paymentDAO.save(payment);
	}
	
	//Get a Payment
	@GetMapping("/payment/{pid}")
	public Payment getPayment(@PathVariable("pid") int pid) {
		
		return paymentDAO.findOne(pid);
	}
	
	//Delete a Payment
	@DeleteMapping("/payment/{pid}")
	public void deletePayment(@PathVariable("pid") int pid) {
		
		paymentDAO.delete(pid);
		
	}
	
	//Update a Payment
	@PutMapping("/payment")
	public Payment updatePayment(@RequestBody Payment payment) {

		return paymentDAO.update(payment);
	}

}
