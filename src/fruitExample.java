public class fruitExample {
	public static void main(String[] args){

	Apple apple1 = new Apple();

	}
}

class Apple extends Fruit {
}

class Fruit{
	public Fruit(){
		System.out.println("Fruit's constructor is invoked");
	}
}