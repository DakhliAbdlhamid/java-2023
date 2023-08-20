package com.souha.HelloHuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainControllers {

	@RequestMapping ("/")
	public  String Hello(@RequestParam(value="name", required=false) String searchQuery ,
			@RequestParam(value="lastname", required=false) String lastname,
			@RequestParam(value="times", required=false) int times) {
		if(searchQuery == null) {
		return "Hello Human !";}
		else {
			return ("Hello "+searchQuery + " "+lastname+" !").repeat(times);
		}
	
	}

}
