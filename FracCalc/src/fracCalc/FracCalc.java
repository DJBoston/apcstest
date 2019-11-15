package fracCalc;
import java.util.*;

public class FracCalc {
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
	    
	    
	public static String produceAnswer(String input) {
		String o = "";
		String w,n,d = "";
	    if (input.contains(" + ")) o = "+";
	    else if (input.contains(" - ")) o = "-";
	    else if (input.contains(" * ")) o = "*";
	    else if (input.contains(" / ")) o = "/";
	    String e = input.split(String.format(" \\%s",o))[1].trim();
	    if (e.contains("_")) {
	    	w = e.split("_")[0];
	    	n = e.split("_")[1].split("/")[0];
	    	d = e.split("_")[1].split("/")[1];
	    } else if (e.contains("/")) {
	    	w = "0";
	    	n = e.split("/")[0];
	    	d = e.split("/")[1];
	    } else {
	    	w = e;
	    	n = "0";
	    	d = "1";
	    }
	    return "whole:"+w+" numerator:"+n+" denominator:"+d;
	}
}
    