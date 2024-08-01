//Jacob Miller
//This programs is takes values entered by the user, puts them into an array, and displays them.

import java.util.Scanner;

public class HW9ArrayIntegers {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		//Initialize array
		int[] values = new int[4];

		//Initialize counter
		int i = 0;

		//Prompt
		System.out.print("Please enter values to insert into the array or 0 to quit: ");
	while (true){
			int x = input.nextInt();
			if (x == 0) break;           //If input = 0, break.
			if (i < values.length - 1){  //If within array bounds, add the value
				values[i] = x;
			} else {                     //If not within bounds, expand array
				values = expandArray(values);
				values[i] = x;
			}
			i++;
		}//End while

		//Display Results
		System.out.println();
		System.out.println("Contents of the array:");
		System.out.println("Index   Value");
		for(int j = 0; j < values.length; j++){
			if(values[j] == 0) break;
			System.out.printf("%-8d%d%n", j, values[j]);
		}


	}//End Main
	public static int[] expandArray(int[] array){
		int[] temp = array;                       //Store values in temporary array
		array = new int[array.length*2];         //Declare new array with twice the size
		for (int i = 0; i < temp.length; i++){     //Copy contents to new array
			array[i] = temp[i];
		}
		return array;
	}//end expand array

}