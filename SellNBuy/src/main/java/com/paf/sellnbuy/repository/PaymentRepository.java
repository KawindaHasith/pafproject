package com.paf.sellnbuy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paf.sellnbuy.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
