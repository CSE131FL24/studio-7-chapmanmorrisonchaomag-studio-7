package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	//instance variable
	private double length;
	private double width;

	//constructor
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	//Calculate the area
	public double areaCalculation() {
		return length * width;
	}

	//Calculate the perimeter
	public double periCalculation() {
		return 2 * length + 2 * width;
	}

	public boolean ifSquare() {
		return length == width;
	}

	public boolean compareArea(Rectangle objectComp) {
		return this.length * this.width <= objectComp.length * objectComp.width;
	}

	public void drawRectangle() {
		StdDraw.filledRectangle(.5, .5, width/2, length/2);
	}

	public static void main(String[] args) {
		StdDraw.setCanvasSize(500,500);
		StdDraw.setXscale(-30,30);
		StdDraw.setYscale(-30,30);


		Rectangle r1 = new Rectangle(10 , 5);
		System.out.println(r1.areaCalculation());
		System.out.println(r1.periCalculation());
		System.out.println(r1.ifSquare());
		r1.drawRectangle();

		Rectangle r2 = new Rectangle(20 , 20);
		System.out.println(r2.areaCalculation());
		System.out.println(r2.periCalculation());
		System.out.println(r2.ifSquare());
		r2.drawRectangle();

		System.out.println("is r1 < r2? " + r1.compareArea(r2));


	}

}
