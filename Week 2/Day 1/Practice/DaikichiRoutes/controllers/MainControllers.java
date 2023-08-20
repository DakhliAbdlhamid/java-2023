package com.souha.DaikichiRoutes.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainControllers {
	
	@RequestMapping ("/daikichi")
	public  String Welcome() {
		
		return "Welcome !";
	}
	@RequestMapping ("/daikichi/today")
	public  String today() {
		
		return "Today you will find luck in all your endeavors!";
	}
	@RequestMapping ("/daikichi/tommorrow")
	public  String tommorrow() {
		
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}

}
