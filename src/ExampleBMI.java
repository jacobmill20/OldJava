//Jacob Miller
//This is the example program from the 2/5/19 lecture

import java.util.Scanner;

public class ExampleBMI{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		//Prompt the user for the height
		System.out.print("Enter height in inches: ");

		//Read value for the height
		double height = input.nextDouble();

		//Prompt user for the weight
		System.out.print("Enter weight in pounds: ");

		//Read value for the weight
		double weight = input.nextDouble();

		//Calculate BMI
		double bmi = weight* 0.45359237 / (height * 0.0254 * height * 0.0254);

		//Display BMI
		System.out.println("BMI is " + bmi);
	}
}