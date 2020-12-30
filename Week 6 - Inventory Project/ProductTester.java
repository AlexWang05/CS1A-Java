/*
* Assignment 6A: An inventory program used to store a range of different school products
* Files: Product.java and ProductTester.java
*/

package inventory_week6;

public class ProductTester {
	public static void main(String[] args) {
		// products created with default constructor
		Product item1 = new Product();
		Product item2 = new Product();

		// products created with overloaded constructor
		Product item3 = new Product(3, "Marker", 200, 7.75);
		Product item4 = new Product(4, "Colored Pencil", 500, 9.5);
		Product item5 = new Product(5, "Eraser", 150, 4.0);
		Product item6 = new Product(6, "Notebook", 400, 6.75);
		
		// displaying details of each product
		// .toString removed as println() calls it automatically
		System.out.println(item1);
		System.out.println(item2);
		System.out.println(item3);
		System.out.println(item4);
		System.out.println(item5);
		System.out.println(item6);

		/* ------------SAMPLE RUN-------------- 
		 * itemNumber : 0
		 * Name : null
		 * Quantity in stock : 0
		 * Price : 0.0
		 * 
		 * itemNumber : 0
		 * Name : null
		 * Quantity in stock : 0
		 * Price : 0.0
		 * 
		 * itemNumber : 3
		 * Name : Marker
		 * Quantity in stock : 200
		 * Price : 7.75
		 * 
		 * itemNumber : 4
		 * Name : Colored Pencil
		 * Quantity in stock : 500
		 * Price : 9.5
		 * 
		 * itemNumber : 5
		 * Name : Eraser
		 * Quantity in stock : 150
		 * Price : 4.0
		 * 
		 * itemNumber : 6
		 * Name : Notebook
		 * Quantity in stock : 400
		 * Price : 6.75
		 * 
		 */
	}
}
