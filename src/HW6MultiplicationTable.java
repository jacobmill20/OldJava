//Jacob Miller
//This program requests a number from the user and displays a multiplication table from that number using a for loop.


import java.util.Scanner;

public class HW6MultiplicationTable {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		//Prompt and read a number
		System.out.print("Please enter a number: ");
		int num = input.nextInt();
		System.out.println();

		//Begin the table
		System.out.println("Multiplication table for " + num);
		System.out.println("Multiplier   Result");
		System.out.println("------------------------");

		//for loop
		for (int i = 1; i <= 10; i++){
			System.out.printf("%-13d%d%n",i,(i*num));
		} //End while

		}
	}