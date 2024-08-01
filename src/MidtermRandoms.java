//Jacob Miller
//This program creates a Random object with seed 15 and displays the first 80 random integers between 0 and 150 using the nextInt() method.

public class MidtermRandoms{
	public static void main(String[] args){

		java.util.Random mySeed = new java.util.Random(15);
		for(int i = 0; i < 80; i++){
			System.out.print(mySeed.nextInt(150) + " ");
		}
	}
}