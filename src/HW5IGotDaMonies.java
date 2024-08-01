//Jacob Miller
//This program reads an amount of money from the user, and displays
//the amount of dollars and the amount of cents.

import java.util.Scanner;

public class HW5IGotDaMonies {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		//Promt and read
		System.out.print("Please enter an amount of money using a dollar sign and decimal point: ");
		String money = input.nextLine();

		//Identify where the decimal place is
		char ch = '.';
		int index = money.indexOf(ch);

		//Isolate Dollars
		String dollars = money.substring(1, index);

		//Isolate Cents
		String cents = money.substring(index + 1, index + 3);

		//Display
		System.out.println("There are " + dollars + " dollars and " + cents + " cents.");
	}
}