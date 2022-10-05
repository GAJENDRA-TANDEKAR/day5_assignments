package SmallPrograms;


import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		int num;
		Scanner read = new Scanner(System.in);

		System.out.println(" to check enter number is even odd  enter number : ");

		num = read.nextInt();

		if (num % 2 == 0) {
			System.out.println(" the number is even");
		} else {
			System.out.println(" the number is odd");
		}
	}
 
}
