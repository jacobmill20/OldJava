public class HW1Rectangle{
	public static void main(String[] args){

		Rectangle2 rectangle1 = new Rectangle2(4, 40);
		System.out.println("The width of rectangle1 is " + rectangle1.width + ". The height is " + rectangle1.height + ". The area is " + rectangle1.getArea() + ". The perimeter is " + rectangle1.getPerimeter() + ".");


	}
}
class Rectangle2{
		double width;
		double height;

		Rectangle2(){
		width = 1;
		height = 1;
		}

		Rectangle2(double myWidth, double myHeight){
		width = myWidth;
		height = myHeight;
		}

		double getArea(){
			return width*height;
		}

		double getPerimeter(){
			return 2*(width + height);
		}

	}//End of class Square
