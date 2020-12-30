/*
* Description: Program that takes answers to an exam
* 		grades them.
*/

import java.util.Scanner;

public class DriverExam {
	// Variable / Array declaration
	static final int ANSWER_SIZE = 20;
	private static char[] correct = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A',
			'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};
	private static char[] student = new char[ANSWER_SIZE]; // student answer array
	static int[] missed = null; // initialize to null as instructed
	static int numIncorrect = 0;
	static int numCorrect = 0;
	
	// method to get student's answers
	public DriverExam(char[] s) {
		System.out.println("Enter your answers to the exam questions."
				+ "(Make sure Caps Lock is ON!)");
		
		Scanner input = new Scanner(System.in);
		
		student = s; // assigns student answer
		
		// for-loop to loop through questions
		for (int i = 1; i <= ANSWER_SIZE; i++) {
			System.out.printf("Question %d: ", i); // print question
			char studentAnswer = input.next().charAt(0);
			
			// input validation
			while (studentAnswer != 'A' && studentAnswer != 'B'
					&& studentAnswer != 'C' && studentAnswer != 'D') {
				System.out.println("ERROR: Valid answers are A, B, C, or D.");
				System.out.printf("Question %d: ", i);
				studentAnswer = input.next().charAt(0);
			}
			
			// assigns answer into array
			s[i-1] = studentAnswer;
			
		} // end of for-loop
		
	} // end of constructor
	
	// gradeExam method to grade exam
	static void gradeExam() {
		// determine number of incorrect
		for (int i = 0; i < correct.length; i++) {
			if (correct[i] == student[i])
				numCorrect++;
			else
				numIncorrect++;
		} // end of for-loop
		makeMissedArray();
	}
	
	// stores question #'s that student missed
	private static void makeMissedArray() {
		missed = new int[numIncorrect]; // sets missed array
		int missedCount = 0;
		
		// for-loop to check which questions were wrong
		for (int i = 0; i < ANSWER_SIZE; i++) {
			if (correct[i] != student[i]) {
				missedCount++;
				// assigns incorrect answer to array
				missed[missedCount - 1] = i+1;
			}
		}
		
	} // end of makeMissedArray() Method
	
	// method that returns if student passed the exam
	public static boolean passed() {
		return numCorrect >= 15;
	}
	
	// returns # of correct answers
	public static int totalCorrect() {
		return numCorrect;
	}
	
	// returns # of incorrect answers
	public static int totalIncorrect() {
		return numIncorrect;
	}
	
	// method that returns array of missed question #'s
	public static int[] questionsMissed() {
		return missed;
	}
}
