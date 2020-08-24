package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	double divide(double dividend, double divisor) {
		if(divisor == 0.0) {
			throw new IllegalArgumentException("divisor cannot be 0.0");
		}
		double quotient = dividend/divisor;
		return quotient;
	}
	
	
	String reverseString(String string) {
		if (string.equals("")) throw new IllegalStateException();
		
		return new StringBuilder(string).reverse().toString();
	}
	
}
//2. In the ExceptionMethods class, write a method called divide that takes
	//   two doubles as parameters and returns their quotient as a double. This method 
	//   should throw an IllegalArgumentException if the denominator is 0.0.

//4. In the ExceptionMethods class, write a method called reverseString that takes a
	//   String and returns the reverse of that String. It should throw an IllegalStateException
	//   if the String passed in is empty