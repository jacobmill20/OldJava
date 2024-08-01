//Jacob Miller
//This program displays if an integer entered by the user is even or odd

import java.util.Scanner;

public class HW3NumTest {
	public static void main(String[] agrs){
		Scanner input = new Scanner(System.in);
		//Prompt the user for an integer
		System.out.print("Please enter an integer: ");

		//Read the integer
		int num = input.nextInt();

		//Determine if even or odd
		int calc = num % 2;

		//Display result
		if (calc == 0){
			System.out.println(num + " is even");
		} else
		if (calc == 1){
			System.out.println(num + " is odd");
		}
	}
}