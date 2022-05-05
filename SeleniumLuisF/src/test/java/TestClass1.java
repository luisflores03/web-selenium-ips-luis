
public class TestClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumberInWord(1);
		printNumberInWord(1500);
		printConversion(10.25);
		System.out.println(shouldWakeUp(true,1));
	}
	//Method for print number in word excersise
	 static void printNumberInWord(int numberTest) {
		  switch(numberTest) {
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
	 //Excersise 2 in the email
	 //Method to convert km/h to mi/h and return a int value
	 static long toMilesPerHour(double kilometersPerHour) {
		  if (kilometersPerHour>=0) {
			  Long milesPerHour = Math.round(kilometersPerHour*0.62);
			  return milesPerHour;
		  }
		  else {
			  return -1;
		  }
	  }
	 //Method to print the message
	  static void printConversion(double kilometersPerHour) {
		  if(kilometersPerHour >=0) {
			  long MPH = toMilesPerHour(kilometersPerHour);
			  System.out.println(kilometersPerHour+" km/h = "+MPH+" mi/h");
		  }
		  else {
			  System.out.println("Invalid Value");
		  }

	  }
	  //Method for Barking dog example
	  static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		  if ( hourOfDay >=1 && hourOfDay < 8 || hourOfDay >=22 && hourOfDay <= 23) {
			  return true;
		  }
		  else {
			  return false;
		  }
		  
	  }

}
