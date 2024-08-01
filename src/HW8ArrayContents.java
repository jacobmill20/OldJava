//Jacob Miller
//This program initializes an array using a for loop and also displays the contents using a for loop.

public class HW8ArrayContents {
	public static void main (String[] args){

		//Initialize array
		int[] myArray = new int[12];

		//Add values to array
		for (int i = 0; i < myArray.length; i++){
			myArray[i] = (i*2+2);
		}//end for

		//Print
		System.out.println("The contents of the array are:");
		System.out.println("Index       Value");

		for(int j = 0; j < myArray.length; j++){
			System.out.printf("%-13d%d%n", j, myArray[j]);
		}//end for
	}//end main
}