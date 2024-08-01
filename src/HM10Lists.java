//Jacob Miller
//This program reads two lists from the user and determines if they are identical

import java.util.Scanner;

public class HM10Lists{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		//Prompt
		System.out.print("Enter list1 size and contents: ");
		int size1 = input.nextInt();

		int[] list1 = new int[size1];
		for (int i = 0; i < size1; i++){
			list1[i] = input.nextInt();
		}
		System.out.print("Enter list2 size and contents: ");
		int size2 = input.nextInt();

		int[] list2 = new int[size2];
		for (int h = 0; h < size2; h++){
			list2[h] = input.nextInt();
		}
		//Determin if equal using method
		if (equals(list1, list2)){
			System.out.println("These lists are identical.");
		} else {
			System.out.println("These lists are not identical.");
		}
	}//End Main
	public static boolean equals(int list1[], int list2[]){
		if (list1.length != list2.length) return false; //Not same length

		java.util.Arrays.sort(list1);
		java.util.Arrays.sort(list2);

		for (int i = 0; i < list1.length; i++){
			if (list1[i] != list2[i])
				return false;
		}
		return true;
	}//End Equals
}