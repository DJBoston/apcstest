//package fracCalc;
import java.util.*;

public class Main {
	public static void main(String[] args) {
	    boolean rep = true;
	    Scanner sc = new Scanner(System.in);
	    while (rep) { //check for quit statement
	        System.out.println("Enter expression or \"quit\" to quit.");
	        String a = sc.nextLine();
	        if (a.equals("quit")) rep = false;
	        else { System.out.println(produceAnswer(a)); }    	
	    }
	    sc.close();
	}
	    
	public static int gcf(int a, int b) {
		while(a!=0 && b!=0) {
			int c = b;
			b = a%b;
			a = c;
		}
		return a+b;
	}
	
	public static String produceAnswer(String input) {
		String o = "";
		String w,n,d,w2,n2,d2 = "";
    if (input.contains(" + ")) o = "+";
    else if (input.contains(" - ")) o = "-";
    else if (input.contains(" * ")) o = "*";
    else if (input.contains(" / ")) o = "/";

    String a = input.split(String.format(" \\%s",o))[0].trim();

      if (a.contains("_")) {
        w = a.split("_")[0];
        n = a.split("_")[1].split("/")[0];
        d = a.split("_")[1].split("/")[1];
      } else if (a.contains("/")) {
        w = "0";
        n = a.split("/")[0];
        d = a.split("/")[1];
      } else {
        w = a;
        n = "0";
        d = "1";
      }

    String b = input.split(String.format(" \\%s",o))[1].trim();
    //String b = input.split(" "+o,2)[1].trim();
    //System.out.println(input.split(" "+o)[0]);
    //System.out.println(input.split(" "+o)[1]);
    if (b.contains("_")) {
        
      w2 = b.split("_")[0];
      n2 = b.split("_")[1].split("/")[0];
      d2 = b.split("_")[1].split("/")[1];
    } else if (b.contains("/")) {
      w2 = "0";
      n2 = b.split("/")[0];
      d2 = b.split("/")[1];
    } else {
      w2 = b;
      n2 = "0";
      d2 = "1";
    }
    //System.out.println(n2);
    
    
    int simp1 = Integer.valueOf(n) + (Integer.valueOf(w) * Integer.valueOf(d));
    if (Integer.valueOf(w) < 0) simp1 = -1*Integer.valueOf(n) + (Integer.valueOf(w) * Integer.valueOf(d));
    int simp2 = Integer.valueOf(n2) + (Integer.valueOf(w2) * Integer.valueOf(d2));
    if (Integer.valueOf(w2) < 0) simp2 = -1*Integer.valueOf(n2) + (Integer.valueOf(w2) * Integer.valueOf(d2));

    int cdm = Integer.valueOf(d) * Integer.valueOf(d2);
    int newn1 = (Integer.valueOf(n) * Integer.valueOf(d2)) + (Integer.valueOf(w) * Integer.valueOf(cdm));
    if (Integer.valueOf(w) < 0) newn1 = -1*(Integer.valueOf(n) * Integer.valueOf(d2)) + (Integer.valueOf(w) * Integer.valueOf(cdm));
    int newn2 = (Integer.valueOf(n2) * Integer.valueOf(d)) + (Integer.valueOf(w2) * Integer.valueOf(cdm));
    if (Integer.valueOf(w2) < 0) newn2 = -1*(Integer.valueOf(n2) * Integer.valueOf(d)) + (Integer.valueOf(w2) * Integer.valueOf(cdm));
    
    int newNum = 0;
    int newDen = 0;
    
    if (o.equals("+")) {
      newNum = newn1 + newn2;
      newDen = cdm;
    }
    if (o.equals("-")) {
      newNum = newn1 - newn2;
      newDen = cdm;
    } 
    if (o.equals("*")) {
        newNum = simp1 * simp2
        newDen = cdm;
    }
    if (o.equals("/")) {
        newNum = simp1 * Integer.valueOf(d2)
        newDen = Integer.valueOf(d) * simp2
    }
    
    newW = Math.floor(newNum/NewDen);
    newNum = newNum % newDen;
    
    
  }

}
    
