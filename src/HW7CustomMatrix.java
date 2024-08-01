//Jacob Miller
//This program displays a square matrix with dimensions given by the user


import java.util.Scanner;

public class HW7CustomMatrix {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		//Prompt for dimension
		System.out.print("Please enter a dimension for a matrix: ");
		int n = input.nextInt();
		System.out.println();

		//Use method
		printMatrix(n);
	}//End Main
	public static void printMatrix(int n){
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.printf("%2d", (int)(Math.random()*2));
			}//End j for
			System.out.println();
		}//End i for
	}//End print Matrix
}