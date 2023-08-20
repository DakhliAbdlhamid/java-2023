package com.souha.BurgerTracker1.Controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.souha.BurgerTracker1.Models.Burger;
import com.souha.BurgerTracker1.Services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class  BurgerController {
	@Autowired
	BurgerService burgerService;
	
	@GetMapping("/")
	public String home(@ModelAttribute("burger") Burger burger, Model model) {
		List<Burger> burgers = burgerService.allBurgers();
		model.addAttribute("burgers", burgers);
		return "index.jsp";
	}
	
	@PostMapping("/addBurger")
	public String home(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Burger> burgers = burgerService.allBurgers();
			model.addAttribute("burgers", burgers);
			return "index.jsp";
		}
		burgerService.addBurger(burger);
		return "redirect:/";
	}
	
    // other methods removed for brevity
	@GetMapping("/burgers/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {

        Burger burgers = burgerService.findBurger(id);
        model.addAttribute("burger", burgers);
        return "edit.jsp";
    }
    
    @PutMapping("/burgers/{id}")
    public String update(@Valid @ModelAttribute("burger") Burger burgers, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
        	burgerService.updateBurgers(burgers);
            return "redirect:/";
        }
    }
	
}