/*
* Class: CS1A
* Description: Assignment 9: An inventory program used to
* 	store a range of different products
* Due date: 11/16/2020
* Name: Zhaozhong (Alex) Wang
* File names: Product.java and ProductTester.java
*/

import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Scanner object
		
		// variable declaration
		int maxSize, menuChoice;
		
		
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
			
			do {
				menuChoice = getMenuOption(input);
				executeMenuChoice(menuChoice, products, input);
			} while (menuChoice != 0);
		} // end else
		
	}// end main method
	
	
	// executeMenuChoice method
	// @param menu choice, products array, Scanner object
	public static void executeMenuChoice(int choice, Product[] products, 
			Scanner input) {
		
		// switch statement to test choices
		switch (choice) {
			case 1:
				System.out.println("View Product List");
				displayInventory(products);
				break;
			case 2:
				System.out.println("Add Stock");
				addInventory(products, input);
				break;
			case 3:
				System.out.println("Deduct Stock");
				deductInventory(products, input);
				break;
			case 4:
				System.out.println("Discontinue Stock");
				discontinueInventory(products, input);
				break;
		}
				
	} // end executeMenuChoice()
	

	// getMenuOption method (menu system)
	// @param Scanner object
	// @return integer menu choice chosen by user
	public static int getMenuOption(Scanner input) {
		int choice;
		
		// do-while loop that displays menu and validates input
		do {
		// displays menu
		System.out.println("\n1. View Inventory\n2. Add Stock\n3. Deduct Stock"
				+ "\n4. Discontinue Product\n0. Exit\nPlease enter a menu option:");
		choice = input.nextInt();
		} while (choice < 0 || choice > 4);
		
		return choice;
	} // end getMenuOption()
	
	
	// getProductNumber method (displays index of array and name of products)
	// @param products array and Scanner object
	// @return integer value
	public static int getProductNumber(Product[] products, Scanner input) {
		int productChoice = -1; // local variable of product choice
		
		// for-loop to display index value and product name
		for (int i = 0; i < products.length; i++) {
			System.out.println(i + ": " + products[i].getName());
		}
		
		// do-while loop to prompt information and validate input
		do {
		// getting user input
		System.out.println("Please enter the item number of the "
				+ "product you want to update: ");
		productChoice = input.nextInt();
		
		// choice input validation
		} while (productChoice < 0 || productChoice > products.length - 1);
		
		
		return productChoice;
	} // end getProductNumber()
	
	
	// addInventory method (add stock values to product)
	// @param products array and Scanner object
	public static void addInventory(Product[] products, Scanner input) {
		int productChoice, updateValue = -1; // local variables
		
		// calls getProductNumber method and saves to productChoice
		productChoice = getProductNumber(products, input);
		
		
		// do-while loop to prompt info and validate input
		do {
		System.out.println("How many products do you want to add? ");
		updateValue = input.nextInt();
		
		} while (updateValue < 0);
		
		// adds value to stock
		products[productChoice].addToInventory(updateValue);
	} // end addInventory()
	
	
	// deductInventory method (deduct values to product)
	// @param product array and Scanner object
	public static void deductInventory(Product[] products, Scanner input) {
		int productChoice, updateValue = -1;
		
		// calls getProductNumber method and saves to productChoice
		productChoice = getProductNumber(products, input);
		
		// prompts info and validates input
		do {
		System.out.println("How many products do you want to deduct? ");
		updateValue = input.nextInt();
		
		} while (updateValue < 0 || updateValue > products[productChoice].getQtyInStock());
		
		// deducts value from stock
		products[productChoice].deductFromInventory(updateValue);
	} // end deductInventory()
	
	
	// discontinueInventory method to mark stock as discontinued
	// @param products array and Scanner object
	public static void discontinueInventory(Product[] products, Scanner input) {
		int productChoice;
		
		productChoice = getProductNumber(products, input);
		
		// use setActive() method to set active value to false
		products[productChoice].setActive(false);
	} // end discontinueInventory()
	

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
	 *Enter the number of products you would like to add or
	 *Enter 0 (zero) if you do not wish to add products:
	 *3
	 *
	 *Please enter the product name: 
	 *Book
	 *Please enter the quantity of stock for this product: 
	 *20
	 *Please enter the price for this product: 
	 *15
	 *Please enter the item number: 
	 *1
	 *
	 *Please enter the product name: 
	 *Microphone
	 *Please enter the quantity of stock for this product: 
	 *5
	 *Please enter the price for this product: 
	 *12.99
	 *Please enter the item number: 
	 *2
	 *
	 *Please enter the product name: 
	 *Tape
	 *Please enter the quantity of stock for this product: 
	 *15
	 *Please enter the price for this product: 
	 *3.99
	 *Please enter the item number: 
	 *3
	 *
	 *1. View Inventory
	 *2. Add Stock
	 *3. Deduct Stock
	 *4. Discontinue Product
	 *0. Exit
	 *Please enter a menu option:
	 *1
	 *View Product List
	 *
	 *
	 *Item Number : 1
	 *Name : Book
	 *Quantity in stock: 20
	 *Price : 15.0
	 *Stock Value : 300.0
	 *Product Status : Active
	 *
	 *
	 *Item Number : 2
	 *Name : Microphone
	 *Quantity in stock: 5
	 *Price : 12.99
	 *Stock Value : 64.95
	 *Product Status : Active
	 *
	 *
	 *Item Number : 3
	 *Name : Tape
	 *Quantity in stock: 15
	 *Price : 3.99
	 *Stock Value : 59.85
	 *Product Status : Active
	 *
	 *1. View Inventory
	 *2. Add Stock
	 *3. Deduct Stock
	 *4. Discontinue Product
	 *0. Exit
	 *Please enter a menu option:
	 *2
	 *Add Stock
	 *0: Book
	 *1: Microphone
	 *2: Tape
	 *Please enter the item number of the product you want to update: 
	 *0
	 *How many products do you want to add? 
	 *25
	 *
	 *1. View Inventory
	 *2. Add Stock
	 *3. Deduct Stock
	 *4. Discontinue Product
	 *0. Exit
	 *Please enter a menu option:
	 *1
	 *View Product List
	 *
	 *
	 *Item Number : 1
	 *Name : Book
	 *Quantity in stock: 45
	 *Price : 15.0
	 *Stock Value : 675.0
	 *Product Status : Active
	 *
	 *
	 *Item Number : 2
	 *Name : Microphone
	 *Quantity in stock: 5
	 *Price : 12.99
	 *Stock Value : 64.95
	 *Product Status : Active
	 *
	 *
	 *Item Number : 3
	 *Name : Tape
	 *Quantity in stock: 15
	 *Price : 3.99
	 *Stock Value : 59.85
	 *Product Status : Active
	 *
	 *1. View Inventory
	 *2. Add Stock
	 *3. Deduct Stock
	 *4. Discontinue Product
	 *0. Exit
	 *Please enter a menu option:
	 *3
	 *Deduct Stock
	 *0: Book
	 *1: Microphone
	 *2: Tape
	 *Please enter the item number of the product you want to update: 
	 *0
	 *How many products do you want to deduct? 
	 *10
	 *
	 *1. View Inventory
	 *2. Add Stock
	 *3. Deduct Stock
	 *4. Discontinue Product
	 *0. Exit
	 *Please enter a menu option:
	 *4
	 *Discontinue Stock
	 *0: Book
	 *1: Microphone
	 *2: Tape
	 *Please enter the item number of the product you want to update: 
	 *1
	 *
	 *1. View Inventory
	 *2. Add Stock
	 *3. Deduct Stock
	 *4. Discontinue Product
	 *0. Exit
	 *Please enter a menu option:
	 *1
	 *View Product List
	 *
	 *
	 *Item Number : 1
	 *Name : Book
	 *Quantity in stock: 35
	 *Price : 15.0
	 *Stock Value : 525.0
	 *Product Status : Active
	 *
	 *
	 *Item Number : 2
	 *Name : Microphone
	 *Quantity in stock: 5
	 *Price : 12.99
	 *Stock Value : 64.95
	 *Product Status : Discontinued
	 *
	 *
	 *Item Number : 3
	 *Name : Tape
	 *Quantity in stock: 15
	 *Price : 3.99
	 *Stock Value : 59.85
	 *Product Status : Active
	 *
	 *1. View Inventory
	 *2. Add Stock
	 *3. Deduct Stock
	 *4. Discontinue Product
	 *0. Exit
	 *Please enter a menu option:
	 *0
	 *
	 */
	
}// end class ProductTaster
