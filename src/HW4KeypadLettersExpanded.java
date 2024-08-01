//Jacob Miller
//So I thought the last question was a bit easy and I had some extra time on my hands, so I decided to expand it to be able to do
//words and even sentences
//I know I have really poor variable names and organization, but I did this for fun

import java.util.Scanner;

public class HW4KeypadLettersExpanded {
	public static void main(String[] agrs){
		Scanner input = new Scanner(System.in);

		//Prompt the user for a letter
		System.out.print("Please enter a word or phrase: ");
		String letters = input.nextLine();

		//put the letter in lower case
		letters = letters.toLowerCase();

		System.out.println();
		System.out.println("The number pattern is:");

		int characterAt = 0;
		int numChar = letters.length();

		//Match the letter with its corresponding keypad number and display
		while (numChar > 0){
			char test = letters.charAt(characterAt);
			String testies = Character.toString(test); //I found this online :|

			switch (testies){
				case "a":
				case "b":
				case "c": System.out.print("2");
					break;
				case "d":
				case "e":
				case "f": System.out.print("3");
					break;
				case "g":
				case "h":
				case "i": System.out.print("4");
					break;
				case "j":
				case "k":
				case "l": System.out.print("5");
					break;
				case "m":
				case "n":
				case "o": System.out.print("6");
					break;
				case "p":
				case "q":
				case "r":
				case "s": System.out.print("7");
					break;
				case "t":
				case "u":
				case "v": System.out.print("8");
					break;
				case "w":
				case "x":
				case "y":
				case "z": System.out.print("9");
					break;
				case " ": System.out.print(" ");
					break;
				default:
					System.out.print("Invalid Input");
					break;
				} //End switch

				numChar = numChar - 1;
				characterAt = characterAt + 1;

			}//End While
			System.out.println();

	}
}