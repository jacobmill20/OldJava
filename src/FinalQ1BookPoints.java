//Jacob Miller
//This program displays the number of points won depending on the number of books purchased
//given by the user.

import java.util.Scanner;

public class FinalQ1BookPoints {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	//Prompt for books
	System.out.print("Please enter the number of books purchased: ");
	int books = input.nextInt();

	int points; //Initialize points
	//Assign points depending on number of books
	switch (books){
		case 0: points = 0;
			break;
		case 1: points = 5;
			break;
		case 2: points = 15;
			break;
		case 3: points = 30;
			break;
		default: points = 60;
	}
	//print
	System.out.println("You have earned " + points + " points.");
	}
}