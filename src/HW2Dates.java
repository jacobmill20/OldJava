//Jacob Miller
//This program creates a Date object, sets its elapsed time to 10000, 100000, 1000000, and displays the date and time using the toString() method, respectively


public class HW2Dates{
	public static void main(String[] args){

		java.util.Date myDate = new java.util.Date(10000);
		System.out.println(myDate.toString());
		myDate.setTime(100000);
		System.out.println(myDate.toString());
		myDate.setTime(1000000);
		System.out.println(myDate.toString());

	}
}