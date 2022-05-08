package com.java.midExercises;
//Class for the second exercise
public class Calculator {
	//Instance the floor and carpet objects
	Floor floor;
	Carpet carpet;
	//Constructor for the calculator method
	public Calculator(Floor floor, Carpet carpet) {
		this.floor = floor;
		this.carpet = carpet;
	}
	//Call the method of get area and get cost of the floor and carpet classes
	public double getTotalCost() {
		return (floor.getArea()*carpet.getCost());
	}

}
