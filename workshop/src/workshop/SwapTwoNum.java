package workshop;

import java.util.Scanner;

public class SwapTwoNum {

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
	}
}
