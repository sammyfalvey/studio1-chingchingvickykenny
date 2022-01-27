package studio1;

import support.cse131.ArgsProcessor;

public class Average {

	
	public static void main(String[] args) {ArgsProcessor ap = new ArgsProcessor (args);
		// TODO Auto-generated method stub

		int n1 = ap.nextInt("Yo, sup?");
		int n2 = ap.nextInt("The first of two integers to be averaged?");
	    double avgNum = (n1+n2)/2.0;
	    System.out.println(avgNum);
	    
	    
	    
	}

}
