package com.google;

import org.testng.annotations.Test;

public class ExcersiseThreeTest {
  @Test
  static boolean shouldWakeUp(boolean barking, int hourOfDay) {
	  if ( hourOfDay >1 && hourOfDay < 8 || hourOfDay >=22 && hourOfDay <= 23) {
		  return true;
	  }
	  else {
		  return false;
	  }
	  
  }
  public static void main3(String[] args) {
	  shouldWakeUp(true,22);
	  }

}
