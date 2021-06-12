/**
 * Assignment 2A
 * Creates 2 integers and computes new values bases on the two integers.
 * prints five values in output.
 * 
 * @author Alex Wang
 */

public class FiveExpressions {

	public static void main(String[] args) {

		int myId = 20456414; // stores ID number in myId
		int numLet = 9; // stores the number of letters in my first name

		// prints required info
		System.out.println("My first name is Zhaozhong");
		System.out.println("My student ID is " + myId);
		System.out.println("The number of characters in my first name is " + numLet);

		// calculating and storing value #1
		int intResult = myId % 17;
		System.out.println("\nExpression #1 --> " + intResult);

		// value 2
		intResult = (numLet + 17) % 11;
		System.out.println("\nExpression #2 --> " + intResult);

		// value 3
		double doubleResult = (double) myId / (numLet + 800); 
		System.out.println("\nExpression #3 --> " + doubleResult);
		
		// value 4
		intResult = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + numLet; 
		System.out.println("\nExpression #4 --> " + intResult);

		// value 5
		doubleResult = 15000 / (80 + ((myId - 123456) / ((numLet + 20) * ((double) numLet + 20)))); 
		System.out.println("\nExpression #5 --> " + doubleResult);

		/*
		 * SAMPLE RUN
		 * 
		 * My first name is Zhaozhong 
		 * My student ID is 20456413
		 * The number of characters in my first name is 9
		 * 
		 * Expression #1 --> 8
		 * 
		 * Expression #2 --> 4
		 * 
		 * Expression #3 --> 25286.049443757725
		 * 
		 * Expression #4 --> 45
		 * 
		 * Expression #5 --> 0.61837513856456
		 */
	}
}