/*
* Description: Program that takes answers to an exam
* 		grades them.
*/

public class Foothill {
	public static void main(String[] args) {
		char[] s = new char[DriverExam.ANSWER_SIZE]; // student answer array
		
		DriverExam exam = new DriverExam(s);
		
		DriverExam.gradeExam();
		int correct = DriverExam.totalCorrect();
		int incorrect = DriverExam.totalIncorrect();
		int[] missed = DriverExam.questionsMissed();
		
		// printing out result
		System.out.println("Correct answers: " + correct);
		System.out.println("Incorrect answers: " + incorrect);
		
		if (DriverExam.passed())
			System.out.println("You passed the exam.");
		else
			System.out.println("You failed the exam.");
		
		System.out.println("You missed the following questions:");
		
		for (int i : missed)
			System.out.print(i + " ");
	}
	
	/*
	 * ------SAMPLE RUN------
	 * Enter your answers to the exam questions.(Make sure Caps Lock is ON!)
	 * Question 1: A
	 * Question 2: C
	 * Question 3: D
	 * Question 4: B
	 * Question 5: F
	 * ERROR: Valid answers are A, B, C, or D.
	 * Question 5: A
	 * Question 6: C
	 * Question 7: D
	 * Question 8: B
	 * Question 9: A
	 * Question 10: A
	 * Question 11: D
	 * Question 12: C
	 * Question 13: B
	 * Question 14: G
	 * ERROR: Valid answers are A, B, C, or D.
	 * Question 14: A
	 * Question 15: B
	 * Question 16: C
	 * Question 17: C
	 * Question 18: D
	 * Question 19: A
	 * Question 20: B
	 * Correct answers: 4
	 * Incorrect answers: 16
	 * You failed the exam.
	 * You missed the following questions:
	 * 1 2 3 4 5 6 7 8 9 10 11 13 15 18 19 20 
	 */
}
