package com.paf.sellnbuy.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paf.sellnbuy.model.Food;
import com.paf.sellnbuy.repository.FoodRepository;

@Service
public class FoodDAO {
	
		@Autowired
		FoodRepository foodRepo;
	
	    //Save a Food
		public Food save(Food food) {
			
			return foodRepo.save(food);
		}
		
		//Search all Foods
		public List<Food> findAll() {
			
			return foodRepo.findAll();
		}
		
		//Get a Food
		public Food findOne(int id) {
			
			Optional<Food> op = foodRepo.findById(id);
			if (op.isPresent()) {
				
				return op.get();
				
			} else {

				return null;
				
			}
		}
		
		//Delete a Food
		public void delete(int id) {
			
			Food food = foodRepo.getOne(id);	
			Optional<Food> op = foodRepo.findById(id);
			
			if (op.isPresent()) {
				
				foodRepo.delete(food);
				
			} else {

				return;
				
			}
			
			
		}
		
		//Update a Food
		public Food update(Food food) {
			
			return foodRepo.save(food);
			
		}

}
