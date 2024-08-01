//Jacob Miller
/*This program implements the sets and set operations such as union,
difference, and intersection using characteristic function. To simplify the
issue, we consider elements of the sets integers between 1 and 20.*/

import java.util.Scanner;

public class jtm39290A4sets{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		//Prompt and read inputs for set A
		int[] setA = new int[21];
		System.out.println("Enter integers between 1 and 20 for Set A. Use 0 to complete the set:");
		int element = input.nextInt();
		while (element != 0){
			setA[element] = 1;
			element = input.nextInt();
		}
		//Prompt and read inputs for set B
		int[] setB = new int[21];
		System.out.println("Enter integers between 1 and 20 for Set B. Use 0 to complete the set:");
		element = input.nextInt();
		while (element != 0){
			setB[element] = 1;
			element = input.nextInt();
		}
		System.out.println();

		//Functions
		AunionB(setA, setB);
		AintersectB(setA, setB);
		AcomplementB(setA, setB);

	}//End Main

	//method union
	public static void AunionB(int[] A, int[] B) {
		int i;
		int [] temp = new int[21];
		for (i=1; i<=20; i++){
			if (A[i]==1 || B[i]==1)
				temp[i]=1;
		}
		System.out.println("*** The union of A and B is: ");
		printSet(temp);
	}//End Union

	//Method Intersect
	public static void AintersectB(int[] A, int[] B) {
		int i;
		int [] temp = new int[21];
		for (i=1; i<=20; i++){
			if (A[i]==1 && B[i]==1)
				temp[i]=1;
		}
		System.out.println("*** The intersection of A and B is: ");
		printSet(temp);
	}//End Intersect

	//Method Complement
	public static void AcomplementB(int[] A, int[] B) {
		int i;
		int [] temp = new int[21];
		for (i=1; i<=20; i++){
			if (A[i]==1 && B[i]==0)
				temp[i]=1;
		}
		System.out.println("*** The complement of A to B is: ");
		printSet(temp);
	}//End Complement

	//Print Set
	public static void printSet(int[] A) {
		for (int i=1; i<21; i++)
		if (A[i] !=0)
			System.out.print(i + " ");
		System.out.println();
	}//End Print Set
}//End Class