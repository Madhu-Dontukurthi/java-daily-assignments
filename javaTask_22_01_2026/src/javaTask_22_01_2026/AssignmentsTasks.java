package javaTask_22_01_2026;


	import java.util.Scanner;
	public class AssignmentsTasks {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1. Positive or Negative
	        System.out.print("Enter a number to check Positive/Negative: ");
	        int num1 = sc.nextInt();
	        if (num1 > 0) {
	            System.out.println(num1 + " is Positive");
	        } else if (num1 < 0) {
	            System.out.println(num1 + " is Negative");
	        } else {
	            System.out.println("Number is Zero");
	        }

	        // 2. Even or Odd
	        System.out.print("\nEnter an integer to check Even/Odd: ");
	        int num2 = sc.nextInt();
	        if (num2 % 2 == 0) {
	            System.out.println(num2 + " is Even");
	        } else {
	            System.out.println(num2 + " is Odd");
	        }

	        // 3. Voting Eligibility
	        System.out.print("\nEnter age to check Voting Eligibility: ");
	        int age = sc.nextInt();
	        if (age >= 18) {
	            System.out.println("Eligible to vote");
	        } else {
	            System.out.println("Not eligible to vote");
	        }

	        // 4. Largest of Two Numbers
	        System.out.print("\nEnter first number: ");
	        int a = sc.nextInt();
	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();
	        if (a > b) {
	            System.out.println(a + " is larger");
	        } else if (b > a) {
	            System.out.println(b + " is larger");
	        } else {
	            System.out.println("Both numbers are equal");
	        }

	        // 5. Divisibility Check
	        System.out.print("\nEnter a number to check divisibility by 5 and 11: ");
	        int num3 = sc.nextInt();
	        if (num3 % 5 == 0 && num3 % 11 == 0) {
	            System.out.println(num3 + " is divisible by both 5 and 11");
	        } else {
	            System.out.println(num3 + " is NOT divisible by both 5 and 11");
	        }

	        sc.close();
	    }
	

}
