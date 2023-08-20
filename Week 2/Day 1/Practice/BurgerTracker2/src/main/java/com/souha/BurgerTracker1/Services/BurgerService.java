package com.souha.BurgerTracker1.Services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.souha.BurgerTracker1.Models.Burger;
import com.souha.BurgerTracker1.Repositories.BurgerReposetory;



@Service
public class BurgerService {
	private final BurgerReposetory burgerRepo;
	
	public BurgerService(BurgerReposetory burgerRepo) {
		this.burgerRepo = burgerRepo;
	}
	
	public List<Burger> allBurgers() {
		return burgerRepo.findAll();
	}
	
	public Burger addBurger(Burger burger) {
		return burgerRepo.save(burger);
	}

    public Burger findBurger(Long id) {
         
		Optional<Burger> maybeBurger = burgerRepo.findById(id);
		if(maybeBurger.isPresent()) {
			return maybeBurger.get();
		}else {
			return null;
		} 
    }
    public Burger updateBurgers(Burger burger) {

        return burgerRepo.save(burger);
    }
}