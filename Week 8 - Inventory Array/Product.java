/*
* Assignment 8: An inventory program used to store a range of different products
*/

package inventory2_week8;

public class Product {
	// instance field declarations
	private int itemNumber;
	private String name;
	private int qtyInStock; 
	private double price;
	private boolean active = true;

	
	// default constructor
	public Product() {

	}

	// overloaded constructor
	public Product(int number, String name, int qty, double price) {
		this.itemNumber = number;
		this.name = name;
		this.qtyInStock = qty;
		this.price = price;
	}

	/**
	 * @return current value of itemNumber
	 */
	public int getItemNumber() {
		return itemNumber;
	}

	/**
	 * updates the value of itemNumber
	 * @param itemNumber
	 */
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	/**
	 * @return current value of name
	 */
	public String getName() {
		return name;
	}

	/**
	 * updates the value of name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return current value of qtyInStock
	 */
	public int getQtyInStock() {
		return qtyInStock;
	}

	/**
	 * updates the value of qtyInStock
	 * @param qtyInStock
	 */
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	/**
	 * @return current value of price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * updates the value of price
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return current value of active
	 */
	public boolean getActive() {
		return active;
	}

	/**
	 * updates the value of active
	 * @param active
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * @return total inventory value
	 */
	public double getInventoryValue() {
		return price * qtyInStock;
	}

	/**
	 * returns inventory of Product object
	 */
	public String toString() {
		return "\n\nItem Number : " + this.itemNumber + "\nName : " + this.name + "\nQuantity in stock: "
				+ this.qtyInStock + "\nPrice : " + this.price + "\nStock Value : " + getInventoryValue()
				+ "\nProduct Status : " + (this.active ? "Active" : "Discontinued");
	}
} // end class Product