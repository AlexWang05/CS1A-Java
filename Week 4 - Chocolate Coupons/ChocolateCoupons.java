/*
* Class: CS1A
* Description: Assignment 4: This program simulates a chocolate bar store
* 				where buying a chocolate bar results in getting
* 				a coupon, which could be used to buy more bars.
* Due date: 10/23/2020
* Name: Zhaozhong (Alex) Wang
* File name: ChocolateCoupons.java
*/


package chocolatecoupons_week4;

import java.util.Scanner;

public class ChocolateCoupons {

	public static void main(String[] args) {
		
		final int COUPON_REQUIREMENT = 7; //declaring constant for coupon requirements
		int couponBalance = 0; //initializing coupon balance
		String purchaseChoice; //declaring required variables
		char charChoice = 'p';
		
		Scanner input = new Scanner(System.in); //scanner object
		
		while (true) { //used to repeat menu (shut down is checked later in the loop)
			System.out.println("Menu:\nP (process Purchase)" + "\nS (Shut down)");
			purchaseChoice = input.nextLine(); //getting exact choice to display
			
			//getting first character and converting to lower case
			charChoice = Character.toLowerCase(purchaseChoice.charAt(0));
			
			System.out.println("Your choice: " + purchaseChoice); //displaying choice
		
			if (charChoice == 's') { //checking if user wants to exit
				System.out.println("System shutting down.\n\n" + "Good bye");
				break; //ends the loop and thus ending the program
			}
			
			else if (charChoice != 'p') { //checking if an invalid response is entered
				System.out.println("*** Use P or S, please. ***\n");
			}
			
			else { //if purchase option is chosen
				if (couponBalance < 7) { //starting normal transaction
					System.out.println("How many chocolate bars would you like to buy?");
					String barString = input.nextLine(); //getting # of bars bought as String
					int barNumber = Integer.parseInt(barString); //converting to int
					
					if (barNumber >= 0) { //checking for valid number inputs
						couponBalance += barNumber; //adding new coupons
						System.out.println("You just earned " + barNumber + 
								" coupons and have a total of " + couponBalance + " to use.\n");
						//displaying coupons acquired and total coupons
					}
					
					else {
						System.out.println("*** Invalid response ***");
					}
				} //ends normal transaction if-statement
				
				else { //starting award transaction
					System.out.println("You qualify for a free chocolate bar. Would you like to use your credits? (Y or N) ");
					String awardChoiceString = input.nextLine(); //reading as String so Scanner works
					char awardChoice = awardChoiceString.charAt(0); //converting to char
					
					
					if (Character.toLowerCase(awardChoice) == 'y') { //if user wants use coupons
						couponBalance = couponBalance - COUPON_REQUIREMENT; //taking off coupons
						System.out.println("You have just used " + COUPON_REQUIREMENT + " coupons and have "
								+ couponBalance + " left.\nEnjoy your free chocolate bar.\n");
					}
					
					else if (Character.toLowerCase(awardChoice) == 'n') { //if user wants normal transaction
						System.out.println("How many chocolate bars would you like to buy?"); //starts normal transaction
						String barString = input.nextLine();
						int barNumber = Integer.parseInt(barString); //converting to int
						
						if (barNumber >= 0) { //checking for valid input
							couponBalance += barNumber; //adding new coupons
							System.out.println("You just earned " + barNumber + 
									" coupons and have a total of " + couponBalance + " to use.\n");
						}
						
						else //if invalid input is entered
							System.out.println("*** Invalid response ***");
					
					} //ends normal transaction coming from award transaction
					
					else //if the user enters an invalid response
						System.out.println("*** Invalid response ***\n");
					
				} //end award transaction
			} //end purchase option
		} //end main while loop

		
		/*-----------SAMPLE RUN 1------------
		 * Menu:
		 * P (process Purchase)
		 * S (Shut down)
		 * Purchase
		 * Your choice: Purchase
		 * How many chocolate bars would you like to buy?
		 * 2
		 * You just earned 2 coupons and have a total of 2 to use.
		 * 
		 * Menu:
		 * P (process Purchase)
		 * S (Shut down)
		 * p purchase
		 * Your choice: p purchase
		 * How many chocolate bars would you like to buy?
		 * 21
		 * You just earned 21 coupons and have a total of 23 to use.
		 * 
		 * Menu:
		 * P (process Purchase)
		 * S (Shut down)
		 * what
		 * Your choice: what
		 * *** Use P or S, please. ***
		 * 
		 * Menu:
		 * P (process Purchase)
		 * S (Shut down)
		 * P
		 * Your choice: P
		 * You qualify for a free chocolate bar. Would you like to use your credits? (Y or N) 
		 * yes
		 * You have just used 7 coupons and have 16 left.
		 * Enjoy your free chocolate bar.
		 * 
		 * Menu:
		 * P (process Purchase)
		 * S (Shut down)
		 * p urchase?
		 * Your choice: p urchase?
		 * You qualify for a free chocolate bar. Would you like to use your credits? (Y or N) 
		 * Nooo
		 * How many chocolate bars would you like to buy?
		 * 2
		 * You just earned 2 coupons and have a total of 18 to use.
		 * 
		 * Menu:
		 * P (process Purchase)
		 * S (Shut down)
		 * puuuurchase
		 * Your choice: puuuurchase
		 * You qualify for a free chocolate bar. Would you like to use your credits? (Y or N) 
		 * Yes
		 * You have just used 7 coupons and have 11 left.
		 * Enjoy your free chocolate bar.
		 * 
		 * Menu:
		 * P (process Purchase)
		 * S (Shut down)
		 * p
		 * Your choice: p
		 * You qualify for a free chocolate bar. Would you like to use your credits? (Y or N) 
		 * j
		 * *** Invalid response ***
		 * 
		 * Menu:
		 * P (process Purchase)
		 * S (Shut down)
		 * shut down
		 * Your choice: shut down
		 * System shutting down.
		 * 
		 * Good bye
		 */
		
		/*-------------SAMPLE RUN 2---------------
		 * Menu:
		 * P (process Purchase)
		 * S (Shut down)
		 * pUrchase
		 * Your choice: pUrchase
		 * How many chocolate bars would you like to buy?
		 * -1
		 * *** Invalid response ***
		 * Menu:
		 * P (process Purchase)
		 * S (Shut down)
		 * p
		 * Your choice: p
		 * How many chocolate bars would you like to buy?
		 * 222
		 * You just earned 222 coupons and have a total of 222 to use.
		 * 
		 * Menu:
		 * P (process Purchase)
		 * S (Shut down)
		 * p
		 * Your choice: p
		 * You qualify for a free chocolate bar. Would you like to use your credits? (Y or N) 
		 * yes
		 * You have just used 7 coupons and have 215 left.
		 * Enjoy your free chocolate bar.
		 * 
		 * Menu:
		 * P (process Purchase)
		 * S (Shut down)
		 * p
		 * Your choice: p
		 * You qualify for a free chocolate bar. Would you like to use your credits? (Y or N) 
		 * a
		 * *** Invalid response ***
		 * 
		 * Menu:
		 * P (process Purchase)
		 * S (Shut down)
		 * s
		 * Your choice: s
		 * System shutting down.
		 * 
		 * Good bye
		 */
	}

}
