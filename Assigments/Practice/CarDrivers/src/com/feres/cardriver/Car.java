package com.feres.cardriver;

public class Car {

	
	private int gas  ;
	
	







	public Car(int gas) {
		this.gas = gas;
	}






	






	public void Status() {
		System.out.println(this.getGas());
	}
	
	
	
	
	
	
	
	
	
	
	//GETTERS AND SETTERS
	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}
	
	
	
	}


