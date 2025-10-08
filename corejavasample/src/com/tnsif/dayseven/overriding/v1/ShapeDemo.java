package com.tnsif.dayseven.overriding.v1;

public class ShapeDemo {
	public static void main(String[] args) {
		// Create an array of Shape objects
		Shape[] Shapes = new Shape[3];

		// Instantiate objects of Circle, Triangle, and Square
		Shapes[0] = new Circle(5.0);
		Shapes[1] = new Triangle(4.0, 3.0);
		Shapes[2] = new Square(6.0);

		// Demonstrate polymorphism by calling draw and erase methods
		for (Shape Shape : Shapes) {
			Shape.draw();
			Shape.erase();
			System.out.println("----------------------"); 
		}
	}
}


