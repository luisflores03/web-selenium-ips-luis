package com.google;

import org.testng.annotations.Test;

public class ExcersiseTwoTest {
  @Test
  static long toMilesPerHour(double kilometersPerHour) {
	  if (kilometersPerHour>=0) {
		  Long milesPerHour = Math.round(kilometersPerHour*0.62);
		  return milesPerHour;
	  }
	  else {
		  return -1;
	  }
  }
  static void printConversion(double kilometersPerHour) {
	  if(kilometersPerHour >=0) {
		  long MPH = toMilesPerHour(kilometersPerHour);
		  System.out.println(kilometersPerHour+" km/h = "+MPH+" mi/h");
	  }
	  else {
		  System.out.println("Invalid Value");
	  }

  }
  public static void main2(String[] args) {
	  printConversion(1);
	  }

}
