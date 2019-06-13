package com.paf.sellnbuy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.paf.sellnbuy.dao.FoodDAO;
import com.paf.sellnbuy.model.Food;

@RestController
@RequestMapping("/foods")
public class FoodController {
	
	@Autowired
	FoodDAO foodDAO;
	
	//Get all Foods
	@GetMapping("/food")
	public List<Food> getFoods() {
		
		return foodDAO.findAll();
	}
	
	//Add a Food
	@PostMapping("/food")
	public Food addFood(@RequestBody Food food) {
		
		return foodDAO.save(food);
	}
	
	//Get a Food
	@GetMapping("/food/{fid}")
	public Food getFood(@PathVariable("fid") int fid) {
		
		return foodDAO.findOne(fid);
	}
	
	//Delete a Food
	@DeleteMapping("/food/{fid}")
	public void deleteFood(@PathVariable("fid") int fid) {
		
		foodDAO.delete(fid);
		
	}
	
	//Update a Food
	@PutMapping("/food")
	public Food updateFood(@RequestBody Food food) {

		return foodDAO.update(food);
	}

}
