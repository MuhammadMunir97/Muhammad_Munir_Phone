package com.phone;

public class IPhone extends Phone implements Ringable{

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		
	}

	@Override
	public String ring() {		
		return "iPhone " + this.getVersionNumber() + " says " + this.getRingTone();
	}

	@Override
	public String unlock() {
		
		return "unlocking via facial recognigtion";
	}

	@Override
	public void displayInfo() {
		System.out.println("IPhone " + this.getVersionNumber() + " with battery: " + this.getBatteryPercentage() + ", from: " + this.getCarrier());
		
	}

}
