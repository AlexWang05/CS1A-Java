/**
 * Assignment 4
 * This program simulates a chocolate bar store's coupon system
 * 
 * @author Alex Wang
 */

import java.util.Scanner;

public class ChocolateCoupons {
	public static void main(String[] args) {
		final int COUPON_REQUIREMENT = 7; // coupon requirement constant
		int couponBalance = 0; // initialize coupon balance
		char charChoice = 'p';
		String purchaseChoice;

		Scanner input = new Scanner(System.in); // scanner object

		while (true) { // used to repeat menu, shut down checked later in loop
			System.out.println("Menu:\nP (process Purchase)" + "\nS (Shut down)");
			purchaseChoice = input.nextLine();

			// getting first character and converting to lower case
			charChoice = Character.toLowerCase(purchaseChoice.charAt(0));

			System.out.println("Your choice: " + purchaseChoice); // display choice

			if (charChoice == 's') { // shutdown check
				System.out.println("System shutting down.\n\n" + "Good bye");
				break; // ends the loop and program
			}

			else if (charChoice != 'p') { // invalid response filter
				System.out.println("*** Use P or S, please. ***\n");
			}

			else { // purchase option
				if (couponBalance < 7) { // starting normal transaction
					System.out.println("How many chocolate bars would you like to buy?");
					String barString = input.nextLine(); // number of bars
					int barNumber = Integer.parseInt(barString); // convert to integer

					if (barNumber >= 0) { // valid input check
						couponBalance += barNumber; // add new coupons
						
						// display coupons and balance
						System.out.println("You just earned " + barNumber + " coupons and have a total of "
								+ couponBalance + " to use.\n");
					}

					else { // negative bar number
						System.out.println("*** Invalid response ***");
					}
				} // end normal transaction if

				else { // starting award transaction
					System.out.println("You qualify for a free chocolate bar. Would you like to use your credits? (Y or N) ");
					String awardChoiceString = input.nextLine();
					char awardChoice = awardChoiceString.charAt(0); // char choice

					if (Character.toLowerCase(awardChoice) == 'y') { // use coupons
						couponBalance = couponBalance - COUPON_REQUIREMENT; // remove coupons
						System.out.println("You have just used " + COUPON_REQUIREMENT + " coupons and have "
								+ couponBalance + " left.\nEnjoy your free chocolate bar.\n");
					}

					else if (Character.toLowerCase(awardChoice) == 'n') { // don't use coupons
						System.out.println("How many chocolate bars would you like to buy?");
						String barString = input.nextLine();

						int barNumber = Integer.parseInt(barString);

						if (barNumber >= 0) { // valid input check
							couponBalance += barNumber; // add new coupons
							System.out.println("You just earned " + barNumber + " coupons and have a total of "
									+ couponBalance + " to use.\n");
						}

						else // invalid input filter
							System.out.println("*** Invalid response ***");

					} // end normal transaction

					else // invalid response filter
						System.out.println("*** Invalid response ***\n");

				} // end award transaction
			} // end purchase option
		} // end while()

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