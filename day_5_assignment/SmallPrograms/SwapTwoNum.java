package SmallPrograms;

import java.util.Scanner;

public class SwapTwoNum {
/*
	public static void main(String[] args) {
		int a, b, c;
		Scanner read = new Scanner(System.in);

		System.out.print(" the First Number a  is  enter: ");
		a = read.nextInt();
		System.out.print(" the Second Number b is  enter  : ");
		b = read.nextInt();

		c = a;
		a = b;
		b = c;

		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
		System.out.println(" c = " + c);
		
			
		
		
	}
}
*/
	/*
public static void main(String[] args) {
		
		int a = 5;
		System.out.println("value of a = " +a);
		int b = 6;
		System.out.println(" value of b = "+b);
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("  a = " +a);
		System.out.println(" b = "+b);
		System.out.println("c ="+temp);
	}
}
*/
	
public static void main(String[] args) {
		
		int a = 5;
		System.out.println("value of a = " +a);
		int b = 6;
		System.out.println(" value of b = "+b);
		
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("  a = " +a);
		System.out.println(" b = "+b);
		//System.out.println("c ="+c);
	}
}