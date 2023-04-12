package com.caranddriver;

public class Car {
	private int gas;

	public Car() {
		this.gas = 5;
	}
	public void driveAffich (int gas) {
		System.out.printf("You drive the car \n Gas remaining: %d/10 \n",gas);
	}

	
	
	
	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}
	

}
