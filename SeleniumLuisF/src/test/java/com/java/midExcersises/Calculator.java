package com.java.midExcersises;

public class Calculator {
	Floor floor;
	Carpet carpet;
	public Calculator(Floor floor, Carpet carpet) {
		super();
		this.floor = floor;
		this.carpet = carpet;
	}
	public double getTotalCost() {
		return (floor.getArea()*carpet.getCost());
	}

}
