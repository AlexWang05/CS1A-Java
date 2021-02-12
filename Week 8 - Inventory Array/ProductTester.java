/*
* Assignment 8: An inventory program used to store a range of different products
*/

package inventory2_week8;

import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
		// variable declaration
		int maxSize;
				
		Scanner input = new Scanner(System.in);

		// information prompt and input validation
		do {
			System.out.println("Enter the number of products you would like to add or"
					+ "\nEnter 0 (zero) if you do not wish to add products:");
			maxSize = input.nextInt();
			
			if (maxSize < 0) // checking for invalid input
				System.out.println("Incorrect Value entered!");
			
		} while (maxSize < 0);
		
		
		// checking if user does not want to enter products
		if (maxSize == 0)
			System.out.println("No products required!");
		
		else {
			Product[] products = new Product[maxSize]; // create products array
			
			// addToInventory method to get inventory input
			addToInventory(products, input);
			
			// displayInventory method to display inventory
			displayInventory(products);
		}
		
	} // end main
	
	
	/**
	 * addToInventory method (adds products to inventory)
	 * 
	 * @param products array
	 * @param input - Scanner object
	 */
	public static void addToInventory(Product[] products, Scanner input) {
		String tempName; // variable declaration
		int tempQty, tempNumber;
		double tempPrice;
		
		// for-loop to loop through array
		for (int i = 0; i < products.length; i++) {
			// user input
			System.out.println("\nPlease enter the product name: ");
			tempName = input.next();
			
			System.out.println("Please enter the quantity of stock for this product: ");
			tempQty = input.nextInt();
			
			System.out.println("Please enter the price for this product: ");
			tempPrice = input.nextDouble();
			
			System.out.println("Please enter the item number: ");
			tempNumber = input.nextInt();
			
			// adding product object to array
			products[i] = new Product(tempNumber, tempName, tempQty, tempPrice);
		}
		
	} // end addToInventory
	
	
	/**
	 * displayInventory method (displays inventory)
	 * 
	 * @param products array
	 */
	public static void displayInventory(Product[] products) {
		// for-each loop to display inventory
		for (Product item : products) {
			System.out.println(item);
		}

	} // end displayInventory
	
	
	/*
	 * --------SAMPLE RUN----------
	 * Enter the number of products you would like to add or
	 * Enter 0 (zero) if you do not wish to add products:
	 * -1
	 * Incorrect Value entered!
	 * Enter the number of products you would like to add or
	 * Enter 0 (zero) if you do not wish to add products:
	 * 3
	 * 
	 * Please enter the product name: 
	 * Microphone
	 * Please enter the quantity of stock for this product: 
	 * 13
	 * Please enter the price for this product: 
	 * 16.99
	 * Please enter the item number: 
	 * 1
	 * 
	 * Please enter the product name: 
	 * Book
	 * Please enter the quantity of stock for this product: 
	 * 44
	 * Please enter the price for this product: 
	 * 5.89
	 * Please enter the item number: 
	 * 3
	 * 
	 * Please enter the product name: 
	 * Calculator
	 * Please enter the quantity of stock for this product: 
	 * 100
	 * Please enter the price for this product: 
	 * 25.05
	 * Please enter the item number: 
	 * 5
	 * 
	 * 
	 * Item Number : 1
	 * Name : Microphone
	 * Quantity in stock: 13
	 * Price : 16.99
	 * Stock Value : 220.86999999999998
	 * Product Status : Active
	 * 
	 * 
	 * Item Number : 3
	 * Name : Book
	 * Quantity in stock: 44
	 * Price : 5.89
	 * Stock Value : 259.15999999999997
	 * Product Status : Active
	 * 
	 * 
	 * Item Number : 5
	 * Name : Calculator
	 * Quantity in stock: 100
	 * Price : 25.05
	 * Stock Value : 2505.0
	 * Product Status : Active
	 * 
	 */
	
}// end class ProductTaster
