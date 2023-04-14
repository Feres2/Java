package com.feres.cardriver;

public class Driver extends Car {
	//Constructor
	public Driver(int gas) {
		super(gas);
	}
	
	public void drive() {
		this.setGas(this.getGas()-1);
		System.out.println(String.format("after you driving now you have %d", this.getGas()));
	}
	public void boost() {
		this.setGas(this.getGas()-3);
		System.out.println(String.format("after you boost now you have %d", this.getGas()));
	}
	public void refuel() {
		this.setGas(this.getGas()+2);
		System.out.println(String.format("after you refuel now you have %d", this.getGas()));
	}
	


}
