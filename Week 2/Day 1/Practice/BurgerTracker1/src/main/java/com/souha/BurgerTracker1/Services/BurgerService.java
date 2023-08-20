package com.souha.BurgerTracker1.Services;


import java.util.List;

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
}