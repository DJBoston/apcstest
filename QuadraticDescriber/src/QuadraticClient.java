import java.util.Scanner;

public class QuadraticClient {
   public static void main(String[] args) {
	   
	  //create new scanner
      Scanner scaninput = new Scanner(System.in);
      boolean rep = true; //repeat or no
      System.out.println("welcome to quadratic describer\ngive a, b, and c values\n");

      while(rep) {
         String entry;
         
         //get a value, convert to double
         System.out.print("a value: ");
         entry = scaninput.nextLine();
         double a = Double.parseDouble(entry);
         
         //get b value, convert to double
         System.out.print("b value: ");
         entry = scaninput.nextLine();
         double b = Double.parseDouble(entry);
         
         //get c value, convert to double
         System.out.print("c value: ");
         entry = scaninput.nextLine();
         double c = Double.parseDouble(entry);
         
         //run the quadratic describer
         Quadratic.quadraticDescriber(a, b, c);
         
         //check to run again
         System.out.println("\ntype quit to end or anything else to continue");
         entry = scaninput.nextLine();
         if (entry.charAt(0) == 'q' || entry.charAt(0) == 'Q') { //checks to see if the first letter is q
        	 rep = false;
         

            System.out.println();
         }
      }

      scaninput.close();
   }
}