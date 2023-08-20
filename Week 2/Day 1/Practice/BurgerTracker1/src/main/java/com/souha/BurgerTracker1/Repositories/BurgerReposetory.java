package com.souha.BurgerTracker1.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.souha.BurgerTracker1.Models.Burger;


@Repository
public interface BurgerReposetory extends CrudRepository<Burger, Long> {
	 List<Burger> findAll();
}
