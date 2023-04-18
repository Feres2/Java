package com.feres.zookeeper;

public class Bat extends Mammal {

	public Bat(int energyLevel) {
		super(energyLevel);
	}
	public void fly() {
		System.out.println("he's flying !!!!");
		this.setEnergyLevel(this.getEnergyLevel()-50);
		this.displayEnergy();
	}
	public void eatHumans() {
		System.out.println("yummy humans are so spicy");
		this.setEnergyLevel(this.getEnergyLevel()+25);
		this.displayEnergy();
	}
	public void attackTown() {
		System.out.println("bat attacking");
		this.setEnergyLevel(this.getEnergyLevel()-100);
		this.displayEnergy();
	}

}
