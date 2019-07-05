package com.phone;

public class PhoneTest {

	public static void main(String[] args) {
		Galaxy galaxyS9 = new Galaxy("S9", 99, "verizon", "Ring Ring Ring!");
		IPhone iphoneTen = new IPhone("X", 100, "AT&T", "Zing");
		
		galaxyS9.displayInfo();
		System.out.println(galaxyS9.ring());
		System.out.println(galaxyS9.unlock());
		
		iphoneTen.displayInfo();
		System.out.println(iphoneTen.ring());
		System.out.println(iphoneTen.unlock());
	}

}
