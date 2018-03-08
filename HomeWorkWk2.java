/**
  *File: HomeWorkWk2
  *Author: 
  *Date: October 31, 2017
  *Details: Homework for week 2; requires inputting of student EMPLID,
  *  quiz percentages for week 1 - 3, age in months, and current temp in Celsius
  *  then calculates Average Quiz Score, Age in Years, and Temp in F and displays
*/

//Import Statements
import java.util.Scanner;

public class HomeWorkWk2 {

	public static void main(String[] args) {

		//Define Variables to hold values
		int studentID = 0;
		double quiz1Percent = 0.0;
		double quiz2Percent = 0.0;
		double quiz3Percent = 0.0;
		int ageMonths = 0;
		double tempCelsius = 0.0;
				
		//Use Scanner class to input data from Standard I/O
		Scanner scannerIn = new Scanner(System.in);
		
		//Prompt User to input Student ID Number (EMPLID)
		System.out.println("Enter you Student EMPLID:");
			studentID = scannerIn.nextInt();
			
		//Prompt User to enter all 3 quiz scores
		System.out.println("Enter Quiz 1 Percentage Score:");
		 	quiz1Percent = scannerIn.nextDouble();
		 	
		System.out.println("Enter Quiz 2 Percentage Score:");
		 	quiz2Percent = scannerIn.nextDouble();
		 	
		System.out.println("Enter Quiz 3 Percentage Score:");
			quiz3Percent = scannerIn.nextDouble();
			
		//Prompt User to enter their age in months
		System.out.println("Enter your age (in Months): ");
			ageMonths = scannerIn.nextInt();
			
		//Prompt User to enter Current Temperature in Celsius
		System.out.println("Enter Current Temperature (in Celsius):");
			tempCelsius = scannerIn.nextDouble();
			
		//Display inputted data
		System.out.println("Student EMPLID is: " + studentID);
		System.out.println("Your Quiz 1 score was: " + quiz1Percent);
		System.out.println("Your Quiz 2 score was: " + quiz2Percent);
		System.out.println("Your Quiz 3 score was: " + quiz3Percent);
		//Calculate the average quiz scores
		System.out.println("Your average Quiz Score is: " + 
		     ((quiz1Percent+quiz2Percent+quiz3Percent)/3));
		System.out.println("Your age in months is: " + ageMonths);
		//Calculate Age in years, ageMonths / 12
		System.out.println("Your age in years is: " + ageMonths/12);
		System.out.println("The Current Temperature (in Celsius) is: " + tempCelsius + "\u00B0");
		//Calculate Temperature in Fahrenheit from tempCelsius input (C * 1.8 + 32 = F)
		System.out.println("The Current Temperature (in Fahrenheit) is: " 
		     + (tempCelsius * 1.8 + 32) + "\u00B0");
	}

}

