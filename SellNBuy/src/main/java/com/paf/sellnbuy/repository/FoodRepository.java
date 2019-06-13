package com.paf.sellnbuy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paf.sellnbuy.model.Food;

public interface FoodRepository extends JpaRepository<Food, Integer>{

}
