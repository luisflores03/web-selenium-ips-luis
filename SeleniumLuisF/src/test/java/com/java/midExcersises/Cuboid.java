package com.java.midExcersises;

public class Cuboid extends Rectangle {
	private double height ;

	public Cuboid(double width, double length, double height) {
		super(width, length);
		if(height<0) {
			this.height =0;
			return;
		}
		this.height = height;
		// TODO Auto-generated constructor stub
	}
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		
		return height*super.getArea();
	}


}
