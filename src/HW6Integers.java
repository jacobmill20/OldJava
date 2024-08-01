//Jacob Miller
//This program takes any number of positive integers given by the user and finds the sum and average.


import java.util.Scanner;

public class HW6Integers {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);


		//Prompt the user
		System.out.print("Please enter a positive integer. Enter as many integers as needed, then terminate by entering -1: ");
		int sum = input.nextInt();

		//Initialize values
		int x = 0;
		double runs = 1;

		//Enter While loop
		while (x >= 0){
			System.out.print("Please enter a positive integer: ");
			x = input.nextInt();
			if (x >= 0){
				sum = sum + x;
				runs++;
			}else{
				break;
			}
		}//end for
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + sum/runs);

	}
}