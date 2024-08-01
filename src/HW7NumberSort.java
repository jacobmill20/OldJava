//Jacob Miller
//This program uses a method to sort and display inputted numbers


import java.util.Scanner;

public class HW7NumberSort {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		//Prompt for numbers
		System.out.print("Please enter a number: ");
		int num1 = input.nextInt();
		System.out.print("Please enter a second number: ");
		int num2 = input.nextInt();
		System.out.print("Please enter a third number: ");
		int num3 = input.nextInt();

		//Use Method
		displaySortedNumbers(num1, num2, num3);

	}//End Main
	public static void displaySortedNumbers(int num1, int num2, int num3){
		int temp;
		//If one is bigger than two, swap
		if(num1 > num2){
			temp = num2;
			num2 = num1;
			num1 = temp;
		}
		//If two is bigger than three, swap
		if(num2 > num3){
			temp = num3;
			num3 = num2;
			num2 = temp;
		}
		//If one is bigger than two, swap
		if(num1 > num2){
			temp = num2;
			num2 = num1;
			num1 = temp;
		}
		System.out.println("The numbers in accending order are: " + num1 + " " + num2 + " " + num3);
	}//End displaySortedNumbers
}