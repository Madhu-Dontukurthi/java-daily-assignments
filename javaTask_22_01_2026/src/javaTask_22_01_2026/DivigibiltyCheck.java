package javaTask_22_01_2026;

public class DivigibiltyCheck {

	public static void main(String[] args) {
		int number = 55;

		if (number % 5 == 0 && number % 11 == 0) {
			System.out.println(number + " is divisible by both 5 and 11");
		} else {
			System.out.println(number + " is NOT divisible by both 5 and 11");
		}
	}

}
