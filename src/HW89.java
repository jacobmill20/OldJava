import java.util.InputMismatchException;
import java.util.Scanner;

public class HW89 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Please input an integer: ");
			int int1 = input.nextInt();
		}
		catch (InputMismatchException ex){
			System.out.println("Input is not an integer.");
			throw new InputMismatchException();
		}
	}
}