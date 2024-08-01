//This program creates an array with 100 random integers, then prompts the user for an index and displays an error if the index is out of bounds
//Jacob Miller

import java.util.Scanner;
import java.util.*;

public class HW8and9Part2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		//Initialize array
		int[] array1 = new int[100];
		//Set Values for array
		for(int i = 0; i < 100; i++){
			array1[i] = (int)(Math.random()*100);
		}

		//Print array
		int index = 0;
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				System.out.printf("%-4d", array1[index]);
				index++;
			}
			System.out.println();
		}

		//Promt user for index
		try{
			System.out.print("Please enter an index for the array: ");
			int userIndex = input.nextInt();
			System.out.println("The value at index " + userIndex + " is: " + array1[userIndex]);
		}
		//If index is out of bounds, print error
		catch (ArrayIndexOutOfBoundsException ex){
			System.out.println("Out of Bounds.");
		}


	}
}