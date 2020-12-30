/*
* Assignment 3B: This program uses the SAT/ACT scores and GPA to determine
*              who seems to be the stronger applicant.
*/

package admissions_week3;

import java.util.Scanner;

public class Admissions {
	public static void main(String[] args) {
		System.out.println("This program compares two applicants to\n"
				+ "determine which one seems like the stronger\n"
				+ "applicant. For each candidate I will need\n"
				+ "either SAT or ACT scores plus a weighted GPA.\n"); //printing required info
		
		Scanner input = new Scanner(System.in); //creating Scanner object
		
		System.out.println("Information for the first applicant:"
				+ "\n\tdo you have 1) SAT scores or 2) ACT scores? ");
		int scoreChoice = input.nextInt(); //assigning choice to variable scoreChoice
		
		double satScore = 0; //initializing satScore
		double actScore = 0; //initializing actScore
		
		if (scoreChoice == 1) { //if SAT scores are chosen
			System.out.println("SAT math? ");
			int satMath = input.nextInt(); //assigning math score
			
			System.out.println("SAT verbal? ");
			int satVerbal = input.nextInt(); //assigning verbal score
			
			satScore = (double)(2 * satVerbal + satMath )/24; //calculate SAT score
		}
		
		else if (scoreChoice == 2) { // if ACT scores are chosen
			System.out.println("ACT English? ");
			int actEnglish = input.nextInt(); //assigning English score
			
			System.out.println("ACT math? ");
			int actMath = input.nextInt(); //assigning math score
			
			System.out.println("ACT reading? ");
			int actReading = input.nextInt(); //assigning reading score
			
			System.out.println("ACT science? ");
			int actScience = input.nextInt(); //assigning science score
			
			actScore = (double)((2 * actReading + actEnglish + actMath + actScience) / 1.8);
			//calculating ACT score
		}
		
		System.out.println("overall GPA? ");
		double actualGPA = input.nextDouble(); //storing overall GPA
		
		System.out.println("Max GPA? ");
		double maxGPA = input.nextDouble(); //storing max GPA
		
		double gpaScore = (actualGPA / maxGPA) * 100; //calculating total GPA Score
		
		double overallScore1 = 0; //initializing overall score variable for student 1
		
		if (scoreChoice == 1) //checking if SAT score was chosen/calculated
			overallScore1 = satScore + gpaScore;
		
		else if (scoreChoice == 2) //checking if ACT score was chosen/calculated
			overallScore1 = actScore + gpaScore;
		
		//getting information for second applicant
		System.out.println("\nInformation for the second applicant:"
				+ "\n\tdo you have 1) SAT scores or 2) ACT scores? ");
		scoreChoice = input.nextInt(); //assigning choice to variable scoreChoice
		
		if (scoreChoice == 1) { //if SAT scores are chosen
			System.out.println("SAT math? ");
			int satMath = input.nextInt(); //assigning math score
			
			System.out.println("SAT verbal? ");
			int satVerbal = input.nextInt(); //assigning verbal score
			
			satScore = (double)(2 * satVerbal + satMath )/24; //calculate SAT score
		}
		
		else if (scoreChoice == 2) { // if ACT scores are chosen
			System.out.println("ACT English? ");
			int actEnglish = input.nextInt(); //assigning English score
			
			System.out.println("ACT math? ");
			int actMath = input.nextInt(); //assigning math score
			
			System.out.println("ACT reading? ");
			int actReading = input.nextInt(); //assigning reading score
			
			System.out.println("ACT science? ");
			int actScience = input.nextInt(); //assigning science score
			
			actScore = (double)((2 * actReading + actEnglish + actMath + actScience) / 1.8);
			//calculating ACT score
		}
		
		System.out.println("overall GPA? ");
		actualGPA = input.nextDouble(); //storing overall GPA
		
		System.out.println("Max GPA? ");
		maxGPA = input.nextDouble(); //storing max GPA
		
		gpaScore = (actualGPA / maxGPA) * 100; //calculating total GPA Score
		
		double overallScore2 = 0; //initializing overall score variable for student 2
		
		System.out.println(); //empty line to match sample output
		
		if (scoreChoice == 1) //checking if SAT score was chosen/calculated
			overallScore2 = satScore + gpaScore;
		
		else if (scoreChoice == 2)  //checking if ACT score was chosen/calculated
			overallScore2 = actScore + gpaScore;
		
		System.out.println("First applicant overall score = " + overallScore1
				+ "\nSecond applicant overall score = " + overallScore2);
		
		if (overallScore1 > overallScore2) //checking if 1st applicant has a better score
			System.out.println("The first applicant seems to be better");
		
		
		else if (overallScore2 > overallScore1) //checking if 2nd applicant has a better score
			System.out.println("The second applicant seems to be better");
		
		else //checking if the two applicants have equal scores
			System.out.println("The two applicants seem to be equal");
		
		/*---------SAMPLE RUN---------
		 * This program compares two applicants to
		 * determine which one seems like the stronger
		 * applicant. For each candidate I will need
		 * either SAT or ACT scores plus a weighted GPA.
		 * 
		 * Information for the first applicant:
		 * 	do you have 1) SAT scores or 2) ACT scores? 
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
		 * 	do you have 1) SAT scores or 2) ACT scores? 
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
