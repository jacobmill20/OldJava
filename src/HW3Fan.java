//Jacob Miller
//This program uses an object called Fan to represent two fans



public class HW3Fan{
	public static void main(String[] args){

		Fan fan1 = new Fan(3, true, 10, "yello");
		System.out.println(fan1.fanToString());

		Fan fan2 = new Fan(2, false, 5, "blue");
		System.out.println(fan2.fanToString());



	}
}//End Main Class

class Fan{
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	private int speed;
	private boolean on;
	private double radius;
	String color;


	//No arg default constructor
	Fan(){
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}

	//arg constructor
	Fan(int newSpeed, boolean power, double newRadius, String newColor){
		speed = newSpeed;
		on = power;
		radius = newRadius;
		color = newColor;
	}

	//Speed
	int getSpeed(){
		return speed;
	}
	void newSpeed(int newSpeed){
		speed = newSpeed;
	}

	//Power
	String getPower(){
		if (on){
			return "on";
		} else {
			return "off";
		}
	}
	void newPower(boolean newPower){
		on = newPower;
	}

	//Radius
	double getRadius(){
		return radius;
	}
	void newRadius(int newRadius){
		radius = newRadius;
	}

	//Color
	String getColor(){
		return color;
	}
	void newColor(String newColor){
		color = newColor;
	}

	//to string
	String fanToString(){
		if (on){
			return "Speed: " + speed + "  Radius: " + radius + "  Color: " + color + "  The Fan is on.";
		} else {
			return "Speed: " + speed + "  Radius: " + radius + "  Color: " + color + "  The Fan is off.";
		}
	}

}//End Fan

