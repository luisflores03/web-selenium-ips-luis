package com.java.midExercises;
//Class for the third exercise
//Creation of Cuboid class that inherits the methods from Rectangle class
public class Cuboid extends Rectangle {
	private double height ;
	//constructor of the Cuboid class(constructors are not inherited
	public Cuboid(double width, double length, double height) {
		super(width, length);
		if(height<0) {
			this.height =0;
			return;
		}
		this.height = height;
		// TODO Auto-generated constructor stub
	}
	//methods to get height and get volume
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		
		return height*super.getArea();
	}


}
