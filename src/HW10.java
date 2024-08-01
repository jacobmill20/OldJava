/*This programprompts the user to enter three sides of the triangle, a color, and a Boolean value to indicate
whether the triangle is filled. The program displays the area, perimeter, color, and true or false to
indicate whether it is filled or not.

By Jacob Miller
*/


import java.util.Scanner;

public class HW10 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		//Initialize Triangle
		Triangle myTriangle = new Triangle();

		//Prompt for three sides and read them
		System.out.print("Please enter a value for side 1: ");
		double side1 = input.nextDouble();
		myTriangle.setSide1(side1);

		System.out.print("Please enter a value for side 2: ");
		double side2 = input.nextDouble();
		myTriangle.setSide2(side2);

		System.out.print("Please enter a value for side 3: ");
		double side3 = input.nextDouble();
		myTriangle.setSide3(side3);

		input.nextLine();

		//Prompt for color
		System.out.print("Please enter a color: ");
		String color = input.nextLine();
		myTriangle.setColor(color);

		//Prompt for filled
		System.out.print("Please enter a boolean for the filled value: ");
		boolean filled = input.nextBoolean();
		myTriangle.setFilled(filled);

		//Print
		System.out.println();
		System.out.println("Area: " + myTriangle.getArea());
		System.out.println("Perimeter: " + myTriangle.getPerimeter());
		System.out.println("Color: " + myTriangle.getColor());
		System.out.println("Filled: " + myTriangle.isFilled());

	}
}

abstract class GeometricObject {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;

  /** Construct a default geometric object */
  protected GeometricObject() {
    dateCreated = new java.util.Date();
  }

  /** Construct a geometric object with color and filled value */
  protected GeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  /** Return color */
  public String getColor() {
    return color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return filled. Since filled is boolean,
   *  the get method is named isFilled */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /** Get dateCreated */
  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  @Override
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }

  /** Abstract method getArea */
  public abstract double getArea();

  /** Abstract method getPerimeter */
  public abstract double getPerimeter();
}

class Triangle extends GeometricObject {
	private double side1 = 0;
	private double side2 = 0;
	private double side3 = 0;

	//Set Side1
	public void setSide1(double x){
		side1 = x;
	}

	//Set Side2
	public void setSide2(double x){
		side2 = x;
	}

	//Set Side3
	public void setSide3(double x){
		side3 = x;
	}

	//Override getArea
	@Override
	public double getArea(){
		double s = (side1 + side2 + side3) / 2;
		double area= Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}

	//Override getPerimeter
	@Override
	public double getPerimeter(){
		return (side1+side2+side3);
	}
}