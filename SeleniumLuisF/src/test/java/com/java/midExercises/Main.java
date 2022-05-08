package com.java.midExercises;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Run Method for the first exercise
		Wall wall = new Wall(5,4);
		System.out.println("Wall Exercise:");
		System.out.println("area= " + wall.getArea());
		wall.setHeight(-1.5);
		System.out.println("width= " + wall.getWidth());
		System.out.println("height= " + wall.getHeight());
		System.out.println("area= " + wall.getArea());
		
		//Run Method for the second exercise
		System.out.println("");
		System.out.println("Carpet Exercise:");
		Carpet carpet = new Carpet(3.5);
		Floor floor = new Floor(2.75, 4.0);
		Calculator calculator = new Calculator(floor, carpet);
		System.out.println("total= " + calculator.getTotalCost());
		carpet = new Carpet(1.5);
		floor = new Floor(5.4, 4.5);
		calculator = new Calculator(floor, carpet);
		System.out.println("total= " + calculator.getTotalCost());
		
		//Run method for third exercise
		System.out.println("");
		System.out.println("Rectangle Exercise:");
		Rectangle rectangle = new Rectangle(5, 10);
		System.out.println("rectangle.width= " + rectangle.getWidth());
		System.out.println("rectangle.length= " + rectangle.getLength());
		System.out.println("rectangle.area= " + rectangle.getArea());
		Cuboid cuboid = new Cuboid(5,10,5);
		System.out.println("cuboid.width= " + cuboid.getWidth());
		System.out.println("cuboid.length= " + cuboid.getLength());
		System.out.println("cuboid.area= " + cuboid.getArea());
		System.out.println("cuboid.height= " + cuboid.getHeight());
		System.out.println("cuboid.volume= " + cuboid.getVolume());

	}

}
