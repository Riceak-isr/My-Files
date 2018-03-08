/**
 *File: MainState.java
 *Author: 
 *Date: December 6, 2017
 *Details: Request user to input state name
 *      output state bird and flower
 *      ignore case statename is typed in
*/

import java.util.Scanner;

public class MainState {
	
	public static void main(String[] args) {
		
		State inform = new State();
		String states[][] = inform.getState();
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a State or 'None' to exit:");
			String state = input.nextLine();
			if (state.trim().equalsIgnoreCase("None")) {
				break;
				} else {
					int index = getStateIndex(state, states);
			        if (index != -1) {
			        	System.out.printf("Bird: %s \nFlower: %s \n",
			                     getBird(index, states), getFlower(index, states));
			            } else {
			            	System.out.println("Please try again, an invalid State was entered.");
			               }
			           }
			       }
			       input.close();
			   }
			   private static int getStateIndex(String state, String[][] states) {
			       for (int i = 0; i < states.length; i++) {
			           if (state.trim().equalsIgnoreCase(states[i][0])) {
			               return i;
			           }
			       }
			       return -1;
			   }
			   private static String getBird(int index, String[][] states) {
			       return states[index][1];
			   }
			   private static String getFlower(int index, String[][] states) {
			       return states[index][2];
			     }
	}