//Curtis Draheim
//August 29

//A library of math functions


public class Calculate {
	
	//method to square a number
	public static int square(int number) {
		return number*number;
	}
	
	//method to cube a number
	public static int cube(int number) {
		return number*number*number;
	}
	
	//method to get average of two numbers
	public static double average(double num1, double num2) {
		return (num1+num2)/2;
	}
	
	//method to get average of three numbers
	public static double average(double num1, double num2, double num3) {
		return (num1+num2+num3)/3;
	}
	
	//method to change radians to degrees
	public static double toDegrees(double angle) {
		return angle * 180/3.14159;
	}
	
	//method to chance degrees to radians
	public static double toRadians(double angle) {
		return angle * 3.14159/180;
	}
	
	//method to find the descriminant of three numbers
	public static double discriminant(double a, double b, double c) {
		return (b*b) - (4*a*c);
	}
	
	//method to change a mixed number to improper fraction
	public static String toImproperFrac(int a, int b, int c) {
		return Integer.toString((a*c)+b) + "/"  + Integer.toString(c);
	}
	
	//method to change from a improper fraction to a mixed number
	public static String toMixedNum(int a, int b) {
		return Integer.toString(a/b) + "_" + Integer.toString(a%b) + "/"+Integer.toString(b);
	}
	
	//returns whether a int a is divisible by int b
	public static boolean isDivisibleBy(int a, int b) {
		return (a%b == 0);
	}
	
	//returns the absolute value of a number
	public static double absValue(double a) {
		if (a < 0) { return a*-1; }
		return a;
	}
	
	//returns the larger of two numbers
	public static double max(double a, double b) {
		if (a > b) { return a; }
		return b;
	}
	
	//returns the largest of three numbers
	public static double max(double a, double b, double c) {
		if (a > b && a > c) { return a; }
		else if (b > a && b > c) { return b; }
		return c;
	}
	
	//returns the smaller of two numbers
	public static int min(int a, int b) {
		if (a < b) { return a; }
		return b;
	}
	
	//rounds a double to two decimal places
	public static double round2(double a) {
		if (Double.toString(a).substring(Double.toString(a).indexOf("."),Double.toString(a).length()).length() > 3) {
			Double b = Double.valueOf(Double.toString(a).substring(0,Double.toString(a).indexOf(".")+4));
			if (Double.valueOf(String.valueOf(b).substring(String.valueOf(b).length()-1, String.valueOf(b).length())) < 5) { return Double.valueOf(String.valueOf(b).substring(0,String.valueOf(b).length()-1)); }
			return Double.valueOf(Double.toString(a).substring(0,Double.toString(a).indexOf(".")+3))+ 0.01;
		}
		
		return a; //if its already rounded
	}
	
	public static double exponent(double a, int b) {
		double c = 1;
		for (int i=0;i<b;i++) {
			c *= a;
		}
		return c;
	}
	
	public static int factorial(int a) {
		int fact=1;
		for(int i=1;i<=a;i++){    
			fact=fact*i;
		}
		return fact;
	}
	
	public static boolean isPrime(int a) {
		for (int i=2;i<a/2;i++) {
			if (isDivisibleBy(a,i)) {
				return false;
			}
		}
		return true;
	}
	
	
}