/**
 * Assignment 5A
 * This program gets replaces characters within a text with other characters.
 * 
 * @author Alex Wang
 */

import java.util.Scanner;

public class TextProcessing {
	static final int MIN_SIZE = 4; // minimum text size
	
	public static void main(String[] args) {
		char charInput = getKeyCharacter(); // get key character
		String stringText = getString(); // get text

		String maskedString = maskCharacter(stringText, charInput);
		String removedString = removeCharacter(stringText, charInput);
		
		int charCount = countKey(stringText, charInput);

		// printing results
		System.out.println("\nString with " + charInput + " masked:\n" + maskedString);
		System.out.println("\nString with " + charInput + " removed:\n" + removedString);
		System.out.println("\n# " + charInput + "s: " + charCount);
	}

	/**
	 * Gets key character used to search and replace
	 * 
	 * @return character input from user
	 */
	public static char getKeyCharacter() {
		Scanner input = new Scanner(System.in);
		int charLength;
		String stringInput;

		do {
			System.out.println("Please enter a SINGLE " + "character to act as key: ");
			stringInput = input.nextLine();

			// get character length
			charLength = stringInput.length();
			
		} while (charLength != 1); // invalid input check
		
		char charInput = stringInput.charAt(0);
		return charInput;
	}

	/**
	 * Gets String text from user
	 * 
	 * @return text input from user
	 */
	public static String getString() {
		int textLength;
		String stringText;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Please enter a phrase or sentence >= 4" + " and <= 500 characters:");
			stringText = input.nextLine();

			textLength = stringText.length(); // get length of text
		} while (textLength < MIN_SIZE); // check for invalid input
			
		input.close();
		return stringText;
	}

	/**
	 * Masks given character in a text with '$'
	 * 
	 * @param String text and character key
	 * @return masked String
	 */
	public static String maskCharacter(String stringText, char charInput) {
		int stringLength = stringText.length(); // length of text
		String maskedString = ""; // new String

		for (int i = 0; i < stringLength; i++) { // loops through text
			// if a character has key char
			if (stringText.charAt(i) == charInput) {
				maskedString += '$'; // add $ to returned text
			}
			
			else {
				// add original char to new string
				maskedString += stringText.charAt(i);
			}
		}

		return maskedString;
	}

	/**
	 * removes key character in text
	 * 
	 * @param String text and key character
	 * @return String with key characters removed
	 */
	public static String removeCharacter(String stringText, char charInput) {
		int stringLength = stringText.length(); // length of text
		String removedString = ""; // new String

		for (int i = 0; i < stringLength; i++) { // loops through text
			if (stringText.charAt(i) != charInput) { // if character is not key
				// add original char to new string
				removedString += stringText.charAt(i);
			}
		}

		return removedString;
	}

	/**
	 * Counts number of key characters in text
	 * 
	 * @param String text and key character
	 * @return Integer with # of key characters
	 */
	public static int countKey(String stringText, char charInput) {
		int stringLength = stringText.length(); // text length
		int charCount = 0; // initialize character count

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
	 * String with 'a' masked: My n$me is Alex $nd I ^ Like Apples
	 * 
	 * String with 'a' removed: My nme is Alex nd I ^ Like Apples
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
	 * String with 'h' masked: Hello, $i, my name is Helen.
	 * 
	 * String with 'h' removed: Hello, i, my name is Helen.
	 * 
	 * # hs: 1
	 */

	/*
	 * -----------SAMPLE RUN 3---------------- 
	 * Please enter a SINGLE character to act as key:
	 * EeE
	 * Please enter a SINGLE character to act as key:
	 * e 
	 * Please enter a phrase or sentence >= 4 and <= 500 characters: The greatest glory in living lies not in never falling, but in rising every time we fall.###
	 * 
	 * String with 'e' masked: Th$ gr$at$st glory in living li$s not in n$v$r
	 * falling, but in rising $v$ry tim$ w$ fall.###
	 * 
	 * String with 'e' removed: Th gratst glory in living lis not in nvr falling,
	 * but in rising vry tim w fall.###
	 * 
	 * # es: 10
	 */

}