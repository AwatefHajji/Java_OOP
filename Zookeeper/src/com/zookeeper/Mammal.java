package com.zookeeper;

public class Mammal {
	 // member variable
	private int energyLevel;

	public Mammal() {
		this.energyLevel = 100;
	}
	public void displayEnergy() {
		System.out.printf("the energy level = %d \n" , getEnergyLevel());
	}
	
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	

}
