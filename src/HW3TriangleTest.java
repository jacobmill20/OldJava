//Jacob Miller
//This program tests if three values given by the user make a triangle.
//If they do, it displays the perimeter

import java.util.Scanner;

public class HW3TriangleTest {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		//Prompt the user for triangle side lengths
		System.out.println("Enter 3 side lengths of a triangle:");

		//Read inputs
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		System.out.println();

		//Test if triangle is legal. If yes, display perimeter.
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			System.out.println("The perimeter is " + (a + b + c));
		} else {
			System.out.println("The sides " + a + " " + b + " " + c + " make an illegal triangle.");
		}
	}
}