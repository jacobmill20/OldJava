//This program prompts the user to read two integers and displays their sum.
//Jacob Miller


import java.util.Scanner;
import java.util.*;

public class HW8and9 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int int1 = 0;
		int int2 = 0;

		boolean continueInput = true;
		do{
			try {
				//Read input
				System.out.print("Please input an integer: ");
				int1 = input.nextInt();
				continueInput = false;
			}
			//If input is not an int, do not read.
			catch (InputMismatchException ex){
				System.out.println("Input is not an integer.");
				input.nextLine();
			}
		} while (continueInput);

		continueInput = true;
		do{
			try {
				System.out.print("Please input a second integer: ");
				int2 = input.nextInt();
					continueInput = false;
			}
			catch (InputMismatchException ex){
				System.out.println("Input is not an integer.");
				input.nextLine();
			}
		} while (continueInput);

		//Print sum
		System.out.println("The sum of the two integers is " + (int1 + int2));
	}
}