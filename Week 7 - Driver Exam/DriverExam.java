/*
 * Assignment 7: Program that takes answers to an exam and grades them.
 */

package driverexam_week7;

public class DriverExam {
	// variable & array declaration
	static final int ANSWER_SIZE = 20;
	private static char[] correct = { 'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C',
			'C', 'B', 'D', 'A' };
	private static char[] student = new char[ANSWER_SIZE]; // student answer array

	static int[] missed = null;
	static int numIncorrect = 0;
	static int numCorrect = 0;

	// constructor for DriverExam object
	public DriverExam(char[] student) {
		// copies elements of student array
		for (int i = 0; i < student.length; i++) {			this.student[i] = student[i];
		}
	}

	/**
	 * this method grades the exam
	 */
	public static void gradeExam() {
		// determine number of incorrect
		for (int i = 0; i < correct.length; i++) {
			if (correct[i] == student[i])
				numCorrect++;
			else
				numIncorrect++;
		} // end for-loop

		makeMissedArray();
	}

	/**
	 * makes missed array and stores the numbers of all missed questions
	 */
	private static void makeMissedArray() {
		missed = new int[numIncorrect]; // sets missed array
		int missedCount = 0;

		// for-loop to check incorrect answers
		for (int i = 0; i < ANSWER_SIZE; i++) {
			if (correct[i] != student[i]) {
				missedCount++;
				// assigns incorrect answer to array
				missed[missedCount - 1] = i + 1;
			}
		}
	}

	/**
	 * @return returns true if student passed, and false if student failed
	 */
	public boolean passed() {
		return numCorrect >= 15;
	}

	/**
	 * @return number of correct answers
	 */
	public static int totalCorrect() {
		return numCorrect;
	}

	/**
	 * @return number of incorrect answers
	 */
	public static int totalIncorrect() {
		return numIncorrect;
	}

	/**
	 * @return array containing numbers of missed questions
	 */
	public static int[] questionsMissed() {
		return missed;
	}
}
