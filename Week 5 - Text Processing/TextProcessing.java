/*
* Assignment 5A: This program gets input from a user, searches for a character
* within a text and replaces it with other characters.
*/

package textprocessing_week5;

import java.util.Scanner;

public class TextProcessing {

	static final int MIN_SIZE = 4; // declaring minimum text size

	public static void main(String[] args) {

		char charInput = getKeyCharacter(); // getting key character
		String stringText = getString();
		String maskedString = maskCharacter(stringText, charInput);
		String removedString = removeCharacter(stringText, charInput);
		int charCount = countKey(stringText, charInput);

		// printing results
		System.out.println("\nString with " + charInput + " masked:\n" + maskedString);
		System.out.println("\nString with " + charInput + " removed:\n" + removedString);
		System.out.println("\n# " + charInput + "s: " + charCount);
	}

	/**
	 * Method that returns key character used to search/replace
	 * @return returns character input from user
	 */
	public static char getKeyCharacter() {
		Scanner input = new Scanner(System.in);
		int charLength;
		String stringInput;

		do {
			System.out.println("Please enter a SINGLE " + "character to act as key: ");
			stringInput = input.nextLine();

			charLength = stringInput.length();
			// getting length to test

		} while (charLength != 1); // checking for invalid input

		char charInput = stringInput.charAt(0);
		return charInput;
	}

	/**
	 * Method that returns String text from user
	 * @return returns text input from user
	 */
	public static String getString() {
		int textLength;
		String stringText;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Please enter a phrase or sentence >= 4" + " and <= 500 characters:");
			stringText = input.nextLine();

			textLength = stringText.length(); // getting length of text
		} while (textLength < MIN_SIZE); // checking for invalid input

		return stringText;
	}

	/** Method that masks given character in a text with '$'
	 * @param takes String (text) and Character (key char) as parameters
	 * @return returns a new String with each key char replaced by a '$'
	 */
	public static String maskCharacter(String stringText, char charInput) {
		int stringLength = stringText.length(); // getting length of text
		String maskedString = ""; // initializing new String

		for (int i = 0; i < stringLength; i++) { // looping through text
			if (stringText.charAt(i) == charInput) {
				// checking if a character has key char.
				maskedString += '$'; // add $ to returned text
			}

			else {
				// if the character is not key
				maskedString += stringText.charAt(i);
				// add original char. to return text
			}
		}

		return maskedString; // returning masked text
	}

	/** Method that removed key character in text
	 * @param takes String (Text) and Character (key char) as parameters
	 * @return returns a new String with key characters removed
	 */
	public static String removeCharacter(String stringText, char charInput) {
		int stringLength = stringText.length(); // getting length of text
		String removedString = ""; // initializing new String

		for (int i = 0; i < stringLength; i++) { // looping through text
			if (stringText.charAt(i) != charInput) { // if the character is not key
				removedString += stringText.charAt(i);
				// add original char. to return text
			}
		}

		return removedString; // returning text w/ removed characters
	}

	
	/** Method that counts the number of key characters in text
	 * @param takes String (Text) and Character (key char) as parameters
	 * @return returns an int with # of key characters
	 */
	public static int countKey(String stringText, char charInput) {
		int stringLength = stringText.length(); // getting text length
		int charCount = 0; // initializing text length

		for (int i = 0; i < stringLength; i++) { // loops through text
			if (stringText.charAt(i) == charInput) { // if key char matched
				charCount++;
			}
		}

		return charCount;
	}
	
	
	/*
	 * ------------SAMPLE RUN 1----------------
	 * Please enter a SINGLE character to act as key: 
	 * abc
	 * Please enter a SINGLE character to act as key: 
	 * a
	 * Please enter a phrase or sentence >= 4 and <= 500 characters:
	 * ha
	 * Please enter a phrase or sentence >= 4 and <= 500 characters:
	 * My name is Alex and I ^ Like Apples
	 * 
	 * String with 'a' masked:
	 * My n$me is Alex $nd I ^ Like Apples
	 * 
	 * String with 'a' removed:
	 * My nme is Alex nd I ^ Like Apples
	 * 
	 * # as: 2
	 */
			
	
	/*
	 * -----------SAMPLE RUN 2-----------------
	 * Please enter a SINGLE character to act as key: 
	 * hi
	 * Please enter a SINGLE character to act as key: 
	 * h
	 * Please enter a phrase or sentence >= 4 and <= 500 characters:
	 * Hello, hi, my name is Helen.
	 * 
	 * String with 'h' masked:
	 * Hello, $i, my name is Helen.
	 * 
	 * String with 'h' removed:
	 * Hello, i, my name is Helen.
	 * 
	 * # hs: 1
	 */
	
	/*
	 * -----------SAMPLE RUN 3----------------
	 * Please enter a SINGLE character to act as key: 
	 * EeE
	 * Please enter a SINGLE character to act as key: 
	 * e
	 * Please enter a phrase or sentence >= 4 and <= 500 characters:
	 * The greatest glory in living lies not in never falling, but in rising every time we fall.###
	 * 
	 * String with 'e' masked:
	 * Th$ gr$at$st glory in living li$s not in n$v$r falling, but in rising $v$ry tim$ w$ fall.###
	 * 
	 * String with 'e' removed:
	 * Th gratst glory in living lis not in nvr falling, but in rising vry tim w fall.###
	 * 
	 * # es: 10
	 */
	
}