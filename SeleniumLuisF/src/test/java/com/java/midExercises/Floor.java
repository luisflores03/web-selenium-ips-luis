package com.java.midExercises;

//Class for the second exercise
public class Floor {
	private double width,length;
	//Constructor for the floor class
	public Floor(double width, double length) {
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
	//method to get the area of the floor
	public double getArea() {
		return length*width;
	}
	

}
