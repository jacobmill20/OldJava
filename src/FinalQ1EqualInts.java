//Jacob Miller
//This program reads three integers from the user and determins if they are equal or not using a method


import java.util.Scanner;

public class FinalQ1EqualInts {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	//Prompt, read and initialize
	System.out.print("Enter 3 integers: ");
	int x = input.nextInt();
	int y = input.nextInt();
	int z = input.nextInt();

	//Call method
	isEqual(x,y,z);
	}//End main

	public static void isEqual(int x, int y, int z){
		if (x == y && y == z){
			System.out.println("The three values are equal.");
		} else {
			System.out.println("The three values are not equal.");
		}
	}//End isEqual

}
