package com.feres.zookeeper;

public class Gorilla extends Mammal {

	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	public void throwSomeThing() {
		System.out.println("he's throwing something ruuunn!!!");
		this.setEnergyLevel(this.getEnergyLevel()-5);
		this.displayEnergy();
	}
	public void eatBananas() {
		System.out.println("yummy i like bannanas!!!");
		this.setEnergyLevel(this.getEnergyLevel()+10);
		this.displayEnergy();
	}
	public void climb() {
		System.out.println("im climbing!!!");
		this.setEnergyLevel(this.getEnergyLevel()-10);
		this.displayEnergy();
	}
	
	
	
}
