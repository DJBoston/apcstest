public class Quadratic {
	public static void quadraticDescriber(double a, double b, double c) {
	
	  //equation for graph
      System.out.println("\nequation for graph: \ny = " + a + " x^2 + " + b + " x + " + c + "\n");
      
      //checks for concavity
      if (a < 0.0D) {
         System.out.println("opens down");
      } else {
         System.out.println("opens up");
      }

      //axis of symmetry
      double aofsym = -b / (2.0D * a) + 0.0D;
      System.out.println("symmetry axis: " + round2(aofsym));
      
      //gets the vertex
      double axisY = aofsym * aofsym * a + b * aofsym + c;
      System.out.println("vertex: (" + round2(aofsym) + ", " + round2(axisY) + ")");
      
    //chekcs for roots
    String roots = quadForm(a, b, c);
    if (roots.equals("no real roots")) {
         System.out.println("no x intercepts");
      } else {
         System.out.println("x intercepts: " + roots);
      }

      System.out.println("y intercept: " + c);
   }
	
	
	
	//MATH FUNCTIONS 
	
	//my round2 function
	public static double round2(double a) {
		if (Double.toString(a).substring(Double.toString(a).indexOf("."),Double.toString(a).length()).length() > 3) {
			Double b = Double.valueOf(Double.toString(a).substring(0,Double.toString(a).indexOf(".")+4));
			if (Double.valueOf(String.valueOf(b).substring(String.valueOf(b).length()-1, String.valueOf(b).length())) < 5) { return Double.valueOf(String.valueOf(b).substring(0,String.valueOf(b).length()-1)); }
			if (Double.valueOf(Double.toString(a).substring(0,Double.toString(a).indexOf(".")+3)) < 0) { return Double.valueOf(Double.toString(a).substring(0,Double.toString(a).indexOf(".")+3))- 0.01; }
			return Double.valueOf(Double.toString(a).substring(0,Double.toString(a).indexOf(".")+3))+ 0.01;
		}
			
		return a; //if its already rounded
	}	

	//my discriminant function
	public static double discriminant(double a, double b, double c) {
		return (b*b) - (4*a*c);
	}

	//my square function
   public static double square(double a) {
      return a*a;
   }

   //my quadform function
   public static String quadForm(double a, double b, double c) {
		if (discriminant(a,b,c) == -1) { return "no real roots"; }
		if (discriminant(a,b,c) == 0 ) { return String.valueOf(round2((-b + sqrt((b*b) - 4 * a * c))/(2*a))); }
		return String.valueOf((-b + sqrt((b*b) - (4 * a * c)))/(2*a)) + " and " + String.valueOf((-b - sqrt((b*b) - (4 * a * c)))/(2*a));
	}

   //my sqrt function
   public static double sqrt(double num) {
		if (num < 0) { throw new ArithmeticException("Can't input a negative number"); }
	    if (num == 0 || num == 1) { return num; } //Checks for 0 or 1
	    int i = 1;
	    int x = 1; 
	    while (x <= num) { 
	      i++; 
	      x = i * i; 
	    } 
	    return round2(i - 1); 
	}


}