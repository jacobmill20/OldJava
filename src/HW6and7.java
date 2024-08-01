//This program contatins a method that returns the union of two arrays lists of integers
//Jacob Miller

import java.util.Scanner;
import java.util.ArrayList;

public class HW6and7{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		System.out.print("Enter five integers for list1: ");
		for(int i = 0; i < 5; i++){
			list1.add(input.nextInt());
		}

		System.out.print("Enter five integers for list2: ");
		for(int i = 0; i < 5; i++){
			list2.add(input.nextInt());
		}

		System.out.println("The combined list is: " + union(list1, list2));


	}
	static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
		for(int i = 0; i < 5; i++){
			list1.add(list2.get(i));
		}
		return list1;
	}

}