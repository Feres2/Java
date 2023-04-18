package com.feres.zookeeper;

public class Mammal {
//VARIABLE
	private int energyLevel ;
//CONSTRACTOR
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}

//METHODES	
	public void displayEnergy() {
		System.out.println("Your energy level is: "+this.getEnergyLevel());
	}
	
	
	
	
	
	
	
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

}
