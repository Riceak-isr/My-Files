/**
  *File: MainGuitar.java
  *Author: 
  *Date: November 15, 2017
  *Details: Driver program for Homework2, CMIS 141
            Assigns values to guitar attributes provided in Guitar.java file
*/

public class GuitarMain {

	public static void main(String[] args) {

		Guitar guitar1 = new Guitar(7, 30.2, "Fender", "Black");
		
		System.out.println(guitar1.toString());
		System.out.println(guitar1.playGuitar());
		
		Guitar guitar2 = new Guitar(6, 20.1, "Stratavarious", "Red");
		
		System.out.println(guitar2.toString());
		System.out.println(guitar2.playGuitar());
		
		Guitar guitar3 = new Guitar(5, 15.2, "Gibson", "Purple");
		
		System.out.println(guitar3.toString());
		System.out.println(guitar3.playGuitar());
	}

}
