/**
  *File: TestHeadPhone.java
  *Author: 
  *Date: December 3, 2017
  *Details: Program to print details about headphone as
  *   detailed in code below and within HeadPhone.java file.
*/


public class TestHeadPhone {

	public static void main(String[] args) {
		
		//Instantiate Object 1
		HeadPhone headPhone1 = new HeadPhone();
		System.out.println("headPhone1: " + headPhone1.toString());
				
		//Instantiate Object 2
		HeadPhone headPhone2 = new HeadPhone();
		
		//Call all methods for Object2
		headPhone2.setHeadPhoneColor("Blue");
		headPhone2.setHeadPhoneModel("gm0345JF");
		headPhone2.setManufacturer("Bose");
		headPhone2.setPluggedIn(true);
		//Static Variable use with class name instead of object name.
		headPhone2.changeVolume(HeadPhone.HIGH); 
		System.out.println("\nheadPhone2: " + headPhone2.toString());
		
		//Instantiate Object 3
		HeadPhone headPhone3 = new HeadPhone();
		//Call all methods for Object3
		headPhone3.setHeadPhoneColor("Pink");
		headPhone3.setHeadPhoneModel("7892345");
		headPhone3.setManufacturer("Apple");
		headPhone3.setPluggedIn(false);
		//Static Variable use with class name instead of object name.
		headPhone3.changeVolume(HeadPhone.LOW);
		System.out.println("\nheadPhone3: " + headPhone3.toString());

	}

}
