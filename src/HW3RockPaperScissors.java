//Jacob Miller
//This program plays rock paper scissors with the user

import java.util.Scanner;

public class HW3RockPaperScissors {
	public static void main(String[] agrs){
		Scanner input = new Scanner(System.in);

		//Prompt the user for their input
		System.out.print("Please enter a 0 for rock, 1 for paper, or 2 for scissors: ");

		//Read their input
		int user = input.nextInt();

		//Calculate the computer's choice
		int comp = (int)(Math.random()*3);

		//Display both choices
		if (user == 0){
			System.out.println("You chose Rock.");
		} else if (user == 1){
			System.out.println("You chose Paper.");
		} else if (user == 2){
			System.out.println("You chose Scissors.");
		} else {
			System.out.println("Invalid input!");
		} //End user display

		if (comp == 0){
			System.out.println("Computer chose Rock.");
		} else if (comp == 1){
			System.out.println("Computer chose Paper.");
		} else if (comp == 2){
			System.out.println("Computer chose Scissors.");
		} //End computer display


		//Determin the winner
		if (user == comp){
			System.out.println("It's a tie!");
		} else if ((user == 0) && (comp == 1)){
			System.out.println("You lose!");
		} else if ((user == 0) && (comp == 2)){
			System.out.println("You win!");
		} else if ((user == 1) && (comp == 0)){
			System.out.println("You win!");
		} else if ((user == 1) && (comp == 2)){
			System.out.println("You lose!");
		} else if ((user == 2) && (comp == 0)){
			System.out.println("You lose!");
		} else if ((user == 2) && (comp == 1)){
			System.out.println("You win!");
		}
	}
}