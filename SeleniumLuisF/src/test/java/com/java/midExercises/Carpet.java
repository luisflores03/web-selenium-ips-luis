package com.java.midExercises;
//Class for the second exercise
public class Carpet {
	private double cost;

	public Carpet(double cost) {
		if(cost<0) {
			this.cost = 0;
			return;
		}
		this.cost = cost;
	}
	//getter and setter for the cost variable
	public double getCost() {
		return this.cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

}
