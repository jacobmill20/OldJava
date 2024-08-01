//Jacob Miller
//This program reads student test scores from the user and grades them on a curve based on the highest score


import java.util.Scanner;

public class HW8StudentScores {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		//Prompt for number of students
		System.out.print("Enter number of students: ");
		int studNum = input.nextInt();

		//Initialize Array
		int[] scores = new int[studNum];

		//Prompt for scores
		System.out.print("Enter " + studNum + " scores: ");
		for (int i = 0; i < scores.length; i++){
			scores[i] = input.nextInt();
		}

		//Find greatest
		int best = 0;
		for(int j = 0; j < scores.length; j++){
			if(scores[j] > best) best = scores[j];
		}

		//Create array for grades
		char[] grades = new char[studNum];
		for(int h = 0; h < grades.length; h++){
			if(scores[h] >= best-10){
				grades[h] = 65;
			} else if(scores[h] >= best-20){
				grades[h] = 66;
			} else if(scores[h] >= best-30){
				grades[h] = 67;
			} else if(scores[h] >= best-40){
				grades[h] = 68;
			} else {
				grades[h] = 70;
			}
		}//end for h

		//Print
		for(int g = 0; g < scores.length; g++){
			System.out.println("Student " + g + " score is " + scores[g] + " and grade is " + grades[g]);
		}

	}//End main
}