/**
* Assignment 6
* An inventory program used to store a range of different school products
* 
* @author Alex Wang
*/


public class Product {
	// instance field declarations
	private int number;
	private String name;
	private int quantity;
	private double price;

	// default constructor to initialize fields to default values
	public Product() {}

	// overloaded constructor to initialize with values
	public Product(int number, String name, int quantity, double price) {
		this.number = number;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	// accessor for item number
	public int getNumber() {
		return number;
	}

	// mutator for item number
	public void setNumber(int number) {
		this.number = number;
	}

	// accessor for product name
	public String getName() {
		return name;
	}

	// mutator for product name
	public void setName(String name) {
		this.name = name;
	}

	// accessor for quantity of units
	public int getQuantity() {
		return quantity;
	}

	// mutator for quantity of units
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// accessor for item prices
	public double getPrice() {
		return price;
	}

	// mutator for item prices
	public void setPrice(double price) {
		this.price = price;
	}

	// returns inventory String to print on console
	@Override
	public String toString() {
		return "itemNumber : " + number + "\nName : " + name + "\nQuantity in stock : " + quantity + "\nPrice : "
				+ price + "\n";
	}

} // end class Product
