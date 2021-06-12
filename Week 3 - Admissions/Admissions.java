/**
 * Assignment 3B
 * Uses SAT/ACT scores and GPA to determine a stronger applicant.
 * 
 * @author Alex Wang
 */

import java.util.Scanner;

public class Admissions {
	public static void main(String[] args) {
		// printing required info
		System.out.println("This program compares two applicants to\n" + "determine which one seems like the stronger\n"
				+ "applicant. For each candidate I will need\n" + "either SAT or ACT scores plus a weighted GPA.\n");

		Scanner input = new Scanner(System.in); // Scanner object

		System.out.println("Information for the first applicant:" + "\n\tdo you have 1) SAT scores or 2) ACT scores? ");
		int scoreChoice = input.nextInt(); // assigns choice to variable scoreChoice

		// initialize scores
		double satScore = 0;
		double actScore = 0;

		// if SAT scores are chosen
		if (scoreChoice == 1) {
			System.out.println("SAT math? ");
			int satMath = input.nextInt(); // assigns math score

			System.out.println("SAT verbal? ");
			int satVerbal = input.nextInt(); // assigns verbal score

			satScore = (double)((2 * satVerbal + satMath) / 24); // calculate SAT score
		}

		// if ACT scores are chosen
		else if (scoreChoice == 2) {
			System.out.println("ACT English? ");
			int actEnglish = input.nextInt(); // assigns English score

			System.out.println("ACT math? ");
			int actMath = input.nextInt(); // assigns math score

			System.out.println("ACT reading? ");
			int actReading = input.nextInt(); // assigns reading score

			System.out.println("ACT science? ");
			int actScience = input.nextInt(); // assigns science score

			actScore = (double)((2 * actReading + actEnglish + actMath + actScience) / 1.8); // calculate ACT score
		}

		// GPA prompts
		System.out.println("overall GPA? ");
		double actualGPA = input.nextDouble();

		System.out.println("Max GPA? ");
		double maxGPA = input.nextDouble();

		// calculate total GPA score
		double gpaScore = (actualGPA / maxGPA) * 100; 

		double overallScore1 = 0; // initialize student 1 overall score 

		// calculate overall score
		if (scoreChoice == 1)
			overallScore1 = satScore + gpaScore;

		else if (scoreChoice == 2)
			overallScore1 = actScore + gpaScore;

		// second applicant information
		System.out.println("\nInformation for the second applicant:" + "\n\tdo you have 1) SAT scores or 2) ACT scores? ");
		scoreChoice = input.nextInt();

		// SAT scores
		if (scoreChoice == 1) { 
			System.out.println("SAT math? ");
			int satMath = input.nextInt(); 

			System.out.println("SAT verbal? ");
			int satVerbal = input.nextInt(); 

			satScore = (double)(2 * satVerbal + satMath) / 24; // calculate SAT score
		}

		// ACT scores
		else if (scoreChoice == 2) {
			System.out.println("ACT English? ");
			int actEnglish = input.nextInt();

			System.out.println("ACT math? ");
			int actMath = input.nextInt();

			System.out.println("ACT reading? ");
			int actReading = input.nextInt(); 
			
			System.out.println("ACT science? ");
			int actScience = input.nextInt();

			actScore = (double)((2 * actReading + actEnglish + actMath + actScience) / 1.8); // calculating ACT score
		}

		System.out.println("overall GPA? ");
		actualGPA = input.nextDouble();

		System.out.println("Max GPA? ");
		maxGPA = input.nextDouble();

		input.close(); // close Scanner
		
		gpaScore = (actualGPA / maxGPA) * 100; // calculate total GPA Score

		double overallScore2 = 0; // initialize student 2 overall score

		// calculate student 2 overall score
		if (scoreChoice == 1)
			overallScore2 = satScore + gpaScore;

		else if (scoreChoice == 2) 
			overallScore2 = actScore + gpaScore;

		System.out.println("\nFirst applicant overall score = " + overallScore1 + 
				"\nSecond applicant overall score = " + overallScore2);

		// find the applicant with the higher score
		if (overallScore1 > overallScore2)
			System.out.println("The first applicant seems to be better");

		else if (overallScore2 > overallScore1)
			System.out.println("The second applicant seems to be better");

		else
			System.out.println("The two applicants seem to be equal");

		/*---------SAMPLE RUN---------
		 * This program compares two applicants to
		 * determine which one seems like the stronger
		 * applicant. For each candidate I will need
		 * either SAT or ACT scores plus a weighted GPA.
		 * 
		 * Information for the first applicant:
		 * do you have 1) SAT scores or 2) ACT scores? 
		 * 2
		 * ACT English? 
		 * 20
		 * ACT math? 
		 * 19
		 * ACT reading? 
		 * 21
		 * ACT science? 
		 * 30
		 * overall GPA? 
		 * 3.5
		 * Max GPA? 
		 * 4.0
		 * 
		 * Information for the second applicant:
		 * do you have 1) SAT scores or 2) ACT scores? 
		 * 1
		 * SAT math? 
		 * 610
		 * SAT verbal? 
		 * 640
		 * overall GPA? 
		 * 4.3
		 * Max GPA? 
		 * 5.0
		 * 
		 * First applicant overall score = 149.16666666666666
		 * Second applicant overall score = 164.75
		 * The second applicant seems to be better
		 */
	}
}