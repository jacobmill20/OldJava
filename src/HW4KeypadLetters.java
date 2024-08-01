//Jacob Miller
//This program the displays the corresponding keypad number

import java.util.Scanner;

public class HW4KeypadLetters {
	public static void main(String[] agrs){
		Scanner input = new Scanner(System.in);

		//Prompt the user for a letter
		System.out.print("Please enter a letter: ");
		String letter = input.nextLine();

		//put the letter in lower case
		letter = letter.toLowerCase();

		System.out.println();

		//Match the letter with its corresponding keypad number
		switch (letter){
			case "a":
			case "b":
			case "c": System.out.println("The corresponding number is: 2");
				break;
			case "d":
			case "e":
			case "f": System.out.println("The corresponding number is: 3");
				break;
			case "g":
			case "h":
			case "i": System.out.println("The corresponding number is: 4");
				break;
			case "j":
			case "k":
			case "l": System.out.println("The corresponding number is: 5");
				break;
			case "m":
			case "n":
			case "o": System.out.println("The corresponding number is: 6");
				break;
			case "p":
			case "q":
			case "r":
			case "s": System.out.println("The corresponding number is: 7");
				break;
			case "t":
			case "u":
			case "v": System.out.println("The corresponding number is: 8");
				break;
			case "w":
			case "x":
			case "y":
			case "z": System.out.println("The corresponding number is: 9");
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}

	}
}