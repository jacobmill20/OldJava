//Jacob Miller
//This program determins if a four digit number is a palindrome

import java.util.Scanner;

public class HW4NumberPalindrome {
	public static void main(String[] agrs){
		Scanner input = new Scanner(System.in);

		//Prompt the user for a four digit number
		System.out.print("Please enter a four digit number: ");
		int num = input.nextInt();

		//Isolate 1000s place
		int thou = (int)(num/1000);

		//Isolate 100s place
		int hund = (int)(num % 1000 / 100);

		//Isolate 10s place
		int tens = (int)(num % 100 / 10);

		//Isolate 1s place
		int ones = (int)(num % 10);

		//Determin if a pallindrome and display
		if (thou == ones && hund == tens){
			System.out.println(num + " is a palindrome.");
		} else {
			System.out.println(num + " is not a palindrome.");
		}
	}
}