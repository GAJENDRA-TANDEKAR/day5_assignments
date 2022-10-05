package SmallPrograms;

import java.util.Scanner;

public class quotientOrRemainder {
	 public static void main(String[] args)
	   {
	      float numerator;
	      float denominator;
	      int quotient;
	      int remainder;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter the Dividend: ");
	      numerator = s.nextFloat();
	      System.out.print("Enter the Divisor: ");
	      denominator = s.nextFloat();
	      
	      quotient = (int) (numerator/denominator);
	      remainder = (int) (numerator%denominator);
	      
	      System.out.println("\nQuotient = " +quotient);
	      System.out.println("Remainder = " +remainder);
	   }
}
