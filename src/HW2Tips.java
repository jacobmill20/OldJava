//Jacob Miller
//This Program calculates gratituity and final bill total with subtotal and gratituity rate.

//Import Scanner
import java.util.Scanner;

public class HW2Tips{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		//Get subtotal from the user and name it variable sub
		System.out.print("Enter the subtotal for the bill: ");
		double sub = input.nextDouble();

		//Get gratuity rate from the user and name variable grat
		System.out.print("Enter the gratuity rate: ");
		double grat = input.nextDouble();

		//Calculate gratuity and declar it as variable tip
		double tip = ((int)(sub*grat)/100.0);

		//Display gratuity
		System.out.println("The amount for gratuity is $" + tip);

		//Calculate and display final bill
		System.out.println("The total final bill is $" + (sub + tip));

	}
}