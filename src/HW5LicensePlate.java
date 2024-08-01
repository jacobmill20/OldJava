//Jacob Miller
//This program creates a randomly generated license plate number

public class HW5LicensePlate {
	public static void main (String[] args){

		//Generate values for plate
		char let1 = (char)(Math.random()*26 + 65);
		char let2 = (char)(Math.random()*26 + 65);
		char let3 = (char)(Math.random()*26 + 65);
		char num1 = (char)(Math.random()*10 + 48);
		char num2 = (char)(Math.random()*10 + 48);
		char num3 = (char)(Math.random()*10 + 48);
		char num4 = (char)(Math.random()*10 + 48);
		//Display values for plate
		System.out.print(let1);
		System.out.print(let2);
		System.out.print(let3);
		System.out.print(num1);
		System.out.print(num2);
		System.out.print(num3);
		System.out.println(num4);
	}
}