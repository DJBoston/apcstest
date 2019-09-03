//Curtis Draheim
//August 29

//A library of math functions


public class Calculate {
	public static int square(int number) {
		return number*number;
	}
	
	public static int cube(int number) {
		return number*number*number;
	}
	
	public static double average(double num1, double num2) {
		return (num1+num2)/2;
	}
	
	public static double average(double num1, num2, num3) {
		return (num1+num2+num3)/3;
	}
	
	public static double toDegrees(double angle) {
		return angle * 180/3.14159;
	}
	
	public static double toRadians(double angle) {
		return angle * 3.14159/180;
	}
	
	public static double discriminant(double a, double b, double c) {
		return (b*b) - (4*a*c);
	}
	
	public static String toImproperFrac(int a, int b, int c) {
		return Integer.toString((a*c)+b) + "/"  + Integer.toString(c);
	}
	
	
}
