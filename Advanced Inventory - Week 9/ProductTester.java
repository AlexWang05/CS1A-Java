/*
* Class: CS1A
* Description: Assignment 8: An inventory program used to
* 	store a range of differet products
* Due date: 11/16/2020
* Name: Zhaozhong (Alex) Wang
* File names: Product.java and ProductTester.java
*/

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
		
	}// end main method
	
	
	// getMenuOption method (menu system)
	// @param Scanner object
	// @return integer menu choice chosen by user
	public static int getMenuOption(Scanner input) {
		int choice;
		
		// do-while loop that displays menu and validates input
		do {
		// displays menu
		System.out.println("1) View Inventory\n2) Add Stock\n3) Deduct Stock"
				+ "\n4) Discontinue Product\n0. Exit\nPlease enter a menu opotion:");
		choice = input.nextInt();
		} while (choice < 0 || choice > 4);
		
		return choice;
	}
	
	
	// getProductNumber method (displays index of array and name of products)
	// @param products array and Scanner object
	// @return integer value
	public static int getProductNumber(Product[] products, Scanner input) {
		int productChoice = -1; // local variable of product choice
		
		// for-loop to display index value and product name
		for (int i = 0; i < products.length; i++) {
			System.out.println(i + ": " + products[i]);
		}
		
		// getting user input
		System.out.println("Please enter the item number of the "
				+ "product you want to update: ");
		productChoice = input.nextInt();
		
		// choice input validation
		while (productChoice < 0 || productChoice > products.length - 1) {
			System.out.println("Invalid Item number\nPlease enter the item"
					+ " number of the product you want to update: ");
			productChoice = input.nextInt();
		}
		
		return productChoice;
	}
	
	
	// addInventory method (add stock values to product)
	// @param products array and Scanner object
	public static void addInventory(Product[] products, Scanner input) {
		int productChoice, updateValue = -1; // local variables
		
		// calls getProductNumber method and saves to productChoice
		productChoice = getProductNumber(products, input);
		
		System.out.println("How many products do you want to add? ");
		updateValue = input.nextInt();
		
		// update value input validation
		while (updateValue < 0) {
			System.out.println("Invalid Update Value\nHow many products"
					+ " do you want to add? ");
			updateValue = input.nextInt();
		}
		
		// adds value to stock
		products[productChoice].addToInventory(updateValue);
	}
	
	
	// deductInventory method (deduct values to product)
	// @param product array and Scanner object
	public static void deductInventory(Product[] products, Scanner input) {
		int productChoice, updateValue = -1;
		
		// calls getProductNumber method and saves to productChoice
		productChoice = getProductNumber(products, input);
		
		System.out.println("How many products do you want to deduct? ");
		updateValue = input.nextInt();
		
		// update value input validation //BUG
		while (updateValue < 0 || updateValue > Product.getQtyInStock()) {
			System.out.println("Invalid Update Value\nHow many products"
					+ " would you want to deduct? ");
			updateValue = input.nextInt();
		}
		
		// deducts value from stock
		products[productChoice].deductFromInventory(updateValue);
	}
	
	
	
	// addToInventory method (adds products to inventory)
	// @param products array and Scanner
	public static void addToInventory(Product[] products, Scanner input) {
		String tempName; // variables needed
		int tempQty, tempNumber;
		double tempPrice;
		
		// for-loop to loop through the array
		for (int i = 0; i < products.length; i++) {
			// getting user input
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
		
	} // end addToInventory method
	
	
	// displayInventory method (displays inventory)
	// @param products array
	public static void displayInventory(Product[] products) {
		// for-each loop to display inventory
		for (Product item : products) {
			System.out.println(item);
		}

	} // end displayInventory method
	
	
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
