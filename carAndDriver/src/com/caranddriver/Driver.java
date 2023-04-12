package com.caranddriver;

public class Driver extends Car {
	
	public void drive() {
		setGas(getGas() - 1);
	}
	public void booster() {
		setGas(getGas() - 3);
	}
	public void Refueling() {
		setGas(getGas() + 2 );
	}
	public void driveAffich () {
		System.out.printf("You drive the car \n Gas remaining: %d/10 \n",getGas());
	}

}
