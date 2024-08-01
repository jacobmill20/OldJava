//Jacob Miller
//This program reads a number and then display the multiplication facts fr that value

import java.util.Scanner;

public class HW5MultiplicationTable {
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

		//While loop
		int count = 1;
		while (count <= 10){
			System.out.printf("%d%14d%n",count,(count*num));
			count++;
		} //End while

		}
	}