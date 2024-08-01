//This is a program that covers arrays.
//The auto-initialize functionality and calling
//methods that take an array as a parameter.

import java.util.Scanner;

public class ArrayFun2_Skeleton {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //use the auto-initialize functionality to create an array
    //with values 3,5,13,25,33,35,43,45
    int[] myArray = {3, 5, 13, 25, 33, 35, 43, 45};

    //display the length of the array
    System.out.println("The length of the array is " + myArray.length);


    //call a method that displays the content of the array
    printArray(myArray);

    //call a method that doubles the contents of myArray
    doubleIt(myArray);


	//Print out the array
	System.out.println("After doubling");
	printArray(myArray);


	//call a method the creates and returns an array of  4 integers
	//initialized to 10 20 30 and 40
	int[] array2 = makeNewArray();

	//Print out the array
	System.out.println("After calling makeNewArray array2 has");
	printArray(array2);


	//call a method that searches for a value in myArray
	//The method will return the index where the value was found, or -1
	//Display the place wher the value was found, or that the value was not found
	int result = findIt(myArray, 66);
	if (result == -1){
		System.out.println("Value not on the array");
	} else {
		System.out.println("The value was found at " + result);
	}


  }//end main

  public static void printArray(int[] array){
	System.out.println("Index     Value");
	for (int i = 0; i < array.length; i++){
		System.out.println(i + "          " + array[i]);
	}
	System.out.println();
  }//end printArray

  //a method that doubles the contents of myArray
  //example of pass by reference
  public static void doubleIt(int[] array){
	  for(int i = 0; i < array.length; i++){
		  array[i] = array[i] * 2;
	  }
  }


  //a method the creates and returns an array of  4 integers
  //initialized to 10 20 30 and 40
  public static int[] makeNewArray(){
	  int[] temp = new int[4];
	  int n = 10;
	  for(int i = 0; i < temp.length; i++){
		  temp[i] = n;
		  n += 10;
	  }
	  return temp;
  }



  //A method that searches for a value in myArray
  //The method will return the index where the value was found, or -1
  //Display the results from the search
  public static int findIt(int[] array, int n){
	  int foundAtIndex = -1; //assume n is not in array
	  for (int i = 0; i < array.length; i++){
		  if (array[i] == n){
			  foundAtIndex = i;
			  break;
		  }
	  }
	  return foundAtIndex;
  }


}//end ArrayFun2_Skeleton