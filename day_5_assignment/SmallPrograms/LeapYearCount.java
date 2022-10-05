package SmallPrograms;

public class LeapYearCount {

	public static void main(String[] args) {

		int x = 2021;

		if ((x % 400 == 0) || ((x % 4 == 0) && (x % 100 != 0))) {
			System.out.println(" is  a Leap Year."+x);
		} else {

			System.out.println(" is NOT a Leap Year. " +x);
		}
	}

}
