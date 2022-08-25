package workshop;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter no of time coin flipped");
		float count = read.nextInt();
		int count0 = 0;
		int count1 = 0;
		for (int i = 0; i < count; i++) {
			float flips = (float) (Math.random());

			if (flips < 0.5) {
				count0++;
			} else {
				count1++;
			}
		}

		float head = (float) (count1 / count * 100);
		float tail = (float) (count0 / count * 100);

		System.out.println("Head percentage is : " + head);
		System.out.println("Tail percentage is : " + tail);
	}

}