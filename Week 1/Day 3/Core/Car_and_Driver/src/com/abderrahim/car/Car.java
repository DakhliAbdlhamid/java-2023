package com.abderrahim.car;

public class Car {
	private Integer gas_lvl;
	
	public Car() {
		this.setGas_lvl(10);
	}
	public void game_over() {
		if ((this.gas_lvl <= 0)  ||  (this.gas_lvl == 0)) {
			System.out.println("Game is Over. You Run Out of Gas !");	
		}
	}

	public Integer getGas_lvl() {
		return gas_lvl;
	}

	public void setGas_lvl(Integer gas_lvl) {
		this.gas_lvl = gas_lvl;
	}
	
	public void Driving() {
		this.gas_lvl ++;
		this.game_over();
	}
	public void Using_boosters() {
		this.gas_lvl -= 3;
		this.game_over();
	}
	public void Refueling() {
		this.gas_lvl += 2;
		this.game_over();
	}
	
	public void drive() {
		System.out.println("You Drive a Car ! \nGas remaining : " + this.gas_lvl + "/10");
	}
	
}
