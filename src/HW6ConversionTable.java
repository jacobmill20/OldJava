//Jacob Miller
//This program uses a for loop to display kg to lbs conversions.



public class HW6ConversionTable {
	public static void main (String[] args){

		System.out.println("Kilograms   Pounds");
		System.out.println("-------------------");
		for (int i = 1; i <= 19; i = i + 2){
			System.out.printf("%-12d%.1f%n", i, (i*2.2));
		}
	}
}
