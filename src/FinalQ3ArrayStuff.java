//Jacob Miller
//This program does some wacky stuff with a five integer array initialized by the user.


import java.util.Scanner;

public class FinalQ3ArrayStuff {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	//Declare and array of integers capable of holding 5 integers.
	int[] myArray = new int[5];

	//Read in 5 integer values from the console and store them in the array.
	System.out.print("Enter five integers: ");
	for (int i = 0; i < 5; i++)
		myArray[i] = input.nextInt();

	//Change the value at index 2 by doubling the value.
	myArray[2] = myArray[2] * 2;

	//Change the value at index 4 with the sum of the values at index 1 and 3.
	myArray[4] = myArray[1] + myArray[3];

	//Call a method public static void displayArray(int[ ] numbers) that will display the contents of the array.
	displayArray(myArray);

	}//End Main

	//The method displayArray must use a loop to display the values.
	public static void displayArray(int[] numbers){
		for (int i = 0; i < 5; i++)
			System.out.print(numbers[i] + " ");
			System.out.println();
	}
}