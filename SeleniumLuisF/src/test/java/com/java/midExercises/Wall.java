package com.java.midExercises;

//Creation of the class for the first excerCise
public class Wall {
	private double width,height;
	//First constructor(no params)
	public Wall() {}
	//First constructor(two double type params)
	public Wall(double width, double height) {
		if (width>=0) {
			this.width = width;
		}
		else {
			this.width = 0;
		}
		if (height>=0) {
			this.height = height;
		}
		else {
			this.height = 0;
		}
	}
	//Getters and setters for the variables width and height
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width<0) {
			this.width = 0;
			return;
		}
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height<0) {
			this.height = 0;
			return;
		}
		this.height = height;
	}
	//method to return the area of the wall
	public double getArea() {
		return height*width;
	}

}
