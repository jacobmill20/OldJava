//Jacob Miller
//This program gets inputs of the height and width of a rectangle from the user then displays the area and perimeter of the rectangle.

//Import the files for the scanner.
import java.util.Scanner;

public class HW2Rectangle {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		//Get width from the user and declare variable
		System.out.print("Please enter the width: ");
		double w = input.nextDouble();

		//Get height from the user and declare variable
		System.out.print("Please enter the height: ");
		double h = input.nextDouble();

		//Display area of the rectangle
		System.out.println("The area is: " + (h*w));

		//Display perimeter of the rectangle
		System.out.println("The permimeter is: " + (2*w + 2*h));
	}
}