package com.java.basicExercises;

public class ExercisesJavaBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Examples for printNumberInWord method
		System.out.println("Number in Word:");
		printNumberInWord(1);
		printNumberInWord(1500);
		
		//Examples for toMilesPerHour method
		System.out.println("");
		System.out.println("To Miles per Hour:");
		System.out.println(toMilesPerHour(1.5));  
		System.out.println(toMilesPerHour(10.25));
		System.out.println(toMilesPerHour(-5.6));
		System.out.println(toMilesPerHour(25.42));
		System.out.println(toMilesPerHour(75.114));
		
		//Examples for printConversion method
		System.out.println("");
		System.out.println("Print Conversion:");
		printConversion(1.5);
		printConversion(10.25); 
		printConversion(-5.6); 
		printConversion(25.42); 
		printConversion(75.114);
		
		//Examples for shouldWakeUp method
		System.out.println("");
		System.out.println("Should Wake Up?");
		System.out.println(shouldWakeUp (true, 1));
		System.out.println(shouldWakeUp (false, 2));
		System.out.println(shouldWakeUp (true, 8));
		System.out.println(shouldWakeUp (true, -1));
	}
		
	//Method for print number in word exercise
	 static void printNumberInWord(int numberToPrint) {
		  switch(numberToPrint) {
		  case 1 : System.out.println("ONE");
		  break;
		  case 2 : System.out.println("TWO");
		  break;
		  case 3 : System.out.println("THREE");
		  break;
		  case 4 : System.out.println("FOUR");
		  break;
		  case 5 : System.out.println("FIVE");
		  break;
		  case 6 : System.out.println("SIX");
		  break;
		  case 7 : System.out.println("SEVEN");
		  break;
		  case 8 : System.out.println("EIGHT");
		  break;
		  case 9 : System.out.println("NINE");
		  break;
		  default: System.out.println("OTHER");
		  break;
		  }
		  
		  
	  }
	 
	 //Method to convert km/h to mi/h and return a type int value
	 static long toMilesPerHour(double kilometersPerHour) {
		  if (kilometersPerHour>=0) {
			  Long milesPerHour = Math.round(kilometersPerHour*0.62);
			  return milesPerHour;
		  }
		  else {
			  return -1;
		  }
	  }
	 //Method to print the conversion
	  static void printConversion(double kilometersPerHour) {
		  if(kilometersPerHour >=0) {
			  long MPH = toMilesPerHour(kilometersPerHour);
			  System.out.println(kilometersPerHour+" km/h = "+MPH+" mi/h");
		  }
		  else {
			  System.out.println("Invalid Value");
		  }

	  }
	  //Method for Barking dog 
	  static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		  if ( hourOfDay >=1 && hourOfDay < 8 && barking || hourOfDay >=22 && hourOfDay <= 23 && barking) {
			  return true;
		  }
		  else {
			  return false;
		  }
		  
	  }

}
