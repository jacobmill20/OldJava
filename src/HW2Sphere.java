//Jacob Miller
//This program will calculate the volume and area of a sphere.

//Import scanner
import java.util.Scanner;

public class HW2Sphere{
	public static void main(String[] args){
		Scanner input =  new Scanner(System.in);

		//Declar pi as a constant
		final double PI = 3.14159;

		//Get radius from the user
		System.out.print("Please enter the radius: ");
		double r = input.nextDouble();

		//Display the area
		System.out.println("The area is " + (4*PI*r*r));

		//Display the volume
		System.out.println("The volume is " + (4.0/3)*PI*r*r*r);

	}
}