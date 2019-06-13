package com.paf.sellnbuy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paf.sellnbuy.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
