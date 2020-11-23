/*
* Class: CS1A
* Description: Assignment 9: An inventory program used to
* 	store a range of different products
* Due date: 11/16/2020
* Name: Zhaozhong (Alex) Wang
* File names: Product.java and ProductTester.java
*/

public class Product {
//Instance field declarations
	private int itemNumber; // unique value for identification
	private String name; // name of the product
	private int qtyInStock; // quantity in stock
	private double price; // price of the product
	private boolean active = true; // status of the product

	// default constructor which initializes instance variables
	// numeric values are 0 (zero) and String values are "" (null)

	public Product() {
	
	}// end constructor
	
	// constructor that allows the setting of the initial values for Products

	public Product(int number, String name, int qty, double price) {
		this.itemNumber = number;
		this.name = name;
		this.qtyInStock = qty;
		this.price = price;
	}// end constructor
	
	
	// addToInventory method for users to add to units in stock
	// @param quantity - holds number of items to deduct
	public void addToInventory(int quantity) {
		qtyInStock += quantity;
	}
	
	
	// deductFromInventory method for users to deduct units in stock
	// @param quantity - holds number of items to deduct
	public void deductFromInventory(int quantity) {
		qtyInStock -= quantity;
	}
	
	// returns the current value of itemNumber
	public int getItemNumber() {
		return itemNumber;
	}// end method getItemNumber
	
	
	// updates the value of itemNumber
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}// end method setItemNumber
	
	
	// returns the current value of name
	public String getName() {
		return name;
	}// end method getName

	
	// updates the value of name
	public void setName(String name) {
		this.name = name;
	}// end method setName
	
	
	// returns the current value of qtyInStock
	public int getQtyInStock() {
		return qtyInStock;
	}// end method getQtyInStock
	
	
	// updates the value of qtyInStock
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}// end method setQtyInStock
	
	
	// returns the current value of price
	public double getPrice() {
		return price;
	}// end method getPrice
	
	
	// updates the value of price
	public void setPrice(double price) {
		this.price = price;
	}// end method setPrice
	
	
	// returns the current value of active
	public boolean getActive() {
		return active;
	}// end method getActive
	
	
	// updates the value of active
	public void setActive(boolean active) {
		this.active = active;
	}// end method setActive
	
	
	// get total value of inventory for this Product
	public double getInventoryValue() {
		return price * qtyInStock;
	}// end method getInventoryValue

	
	// toString() method displays each object to the console
	public String toString() {
		return "\n\nItem Number : " + this.itemNumber + "\nName : " + this.name
				+ "\nQuantity in stock: " + this.qtyInStock + "\nPrice : " 
				+ this.price + "\nStock Value : " + getInventoryValue()
				+ "\nProduct Status : " + (this.active ? "Active" : "Discontinued");
	}// end method toString
}// end class Product