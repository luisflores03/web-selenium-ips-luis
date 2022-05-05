package com.java.midExcersises;

public class Floor {
	private double width,length;

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
	public double getArea() {
		return length*width;
	}
	

}
