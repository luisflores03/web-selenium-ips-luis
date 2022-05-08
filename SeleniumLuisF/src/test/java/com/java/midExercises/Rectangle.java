package com.java.midExercises;
//Class for the third exercise
//Creation of Rectangle class
public class Rectangle {
	private double width,length;
	//Constructor of the Rectangle class
	public Rectangle(double width, double length) {
		if (width>=0) {
			this.width = width;
		}
		else {
			this.width = 0;
		}
		if (length>=0) {
			this.length = length;
		}
		else {
			this.length = 0;
		}
	}
	//getters for the length and width
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	//method to get area of the rectangle
	public double getArea() {
		return length*width;
	}
}
