/*
 * Class: CS1A
 * Description: Programming Assignment 2 Option A - Five Expressions:
 *              creating 2 integer variables and computing new values bases on the two numbers.
 *              Printing five values/expressions in output.
 * Due date: 10/5/2020
 * Name: Zhaozhong (Alex) Wang
 * File name: FiveExpressions.java
*/


package fiveexpressions_week2;

public class FiveExpressions {

	public static void main(String[] args) {
		
		int myId = 20456413;   //storing my Foothill ID number in the myId variable
		int numLet = 9;   //storing the number of letters in my first name (9)
		
		System.out.println("My first name is Zhaozhong");   //printing required info
		System.out.println("My student ID is " + myId);
		System.out.println("The number of characters in my first name is " + numLet);
		
		int intResult = myId % 17;   //calculating and storing value #1
		System.out.println("\nExpression #1 --> " + intResult);

		intResult = (numLet + 17) % 11;   //calculating and storing value #2
		System.out.println("\nExpression #2 --> " + intResult);

		double doubleResult = (double)myId / (numLet + 800);   //calculating and storing value #3
		System.out.println("\nExpression #3 --> " + doubleResult);   
		
		intResult = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + numLet;   //calculating and storing value #4
		System.out.println("\nExpression #4 --> " + intResult);   

		doubleResult = 15000 / (80 + ((myId - 123456) / ((numLet + 20) *
				((double)numLet + 20))));   //calculating and storing value #5
		System.out.println("\nExpression #5 --> " + doubleResult);
		
		
		/*SAMPLE RUN
		 * 
		 * My first name is Zhaozhong
		 * My student ID is 20456413
		 * The number of characters in my first name is 9
		 * 
		 * Expression #1 --> 7
		 * 
		 * Expression #2 --> 4
		 * 
		 * Expression #3 --> 25286.04820766378
		 * 
		 * Expression #4 --> 45
		 * 
		 * Expression #5 --> 0.6183751688767145
		 */
		
	}

}
