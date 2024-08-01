public class CodeWeek3{
	public static void main(String[] args){
		java.util.Date date = new java.util.Date();
		System.out.println(date.toString() + "    " + date.getTime());

		date.setTime(123456000);
		System.out.println(date.toString());

		java.util.Date date2 = new java.util.Date(567000);
		System.out.println(date2.toString());


	}
}