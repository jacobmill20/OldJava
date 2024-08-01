//Jacob Miller
//This program reads integers between 1 and 10 and counts the occurences of each

import java.util.Scanner;

public class HW8IntegerCounter {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		//Initialize array
		int[] counter = new int[11];

		//Read Integers and count to array
		System.out.print("Enter the integers between 1 and 10. End the list with 0: ");
		while(true){
			int temp = input.nextInt();
			if (temp == 0){
				break;
			} else {
				counter[temp] = counter[temp] + 1;
			}
		}//End while
		System.out.println();
		//Print results method
		printResults(counter);
	}
	public static void printResults(int [] array){
		for(int i = 1; i < array.length; i++){
			if (array[i] > 0) System.out.printf("%d occurs %d times.%n", i, array[i]);
		}
	}
}