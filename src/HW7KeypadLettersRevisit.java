//Jacob Miller
//This program takes a phone number inputted as a string and converts it to standard letter/number mapping for telephones.

import java.util.Scanner;

public class HW7KeypadLettersRevisit {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a phone number as string: ");
		String phoneNumber = input.nextLine();
		System.out.println();

		//Find string length
		int length = phoneNumber.length();

		//Enter for with length of the string
		for(int i = 0; i < length; i++){
			//index at i
			char letter = phoneNumber.charAt(i);

			//Make uppercase
			if(97 <= letter && letter <= 122){
				int temp = (int)letter;
				temp = temp - 32;
				letter = (char)temp;
			}

			//Display number or cooresponding number
			if(65 <= letter && letter <= 90){
				int num = getNumber(letter);
				System.out.print(num);
			} else {
				System.out.print(letter);
			}
		}//End for
		System.out.println();
	}//End Main

	public static int getNumber(char uppercaseLetter){
		int x = 0;
		switch (uppercaseLetter){
				case 65:
				case 66:
				case 67: x = 2;
					break;
				case 68:
				case 69:
				case 70: x = 3;
					break;
				case 71:
				case 72:
				case 73: x = 4;
					break;
				case 74:
				case 75:
				case 76: x = 5;
					break;
				case 77:
				case 78:
				case 79: x = 6;
					break;
				case 80:
				case 81:
				case 82:
				case 83: x = 7;
					break;
				case 84:
				case 85:
				case 86: x = 8;
					break;
				case 87:
				case 88:
				case 89:
				case 90: x = 9;
					break;
			}//End Switch
		return x;
	}//End getNumber
}
