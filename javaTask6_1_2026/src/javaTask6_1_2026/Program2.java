package javaTask6_1_2026;

public class Program2 {
	/* 
	 * 2.	Write a program based on the following requirements:
○ 	Create a main method.
○ 	Create a non-static method.
○ 	Create a static method.
○ 	The main method should be called the non-static method.
○ 	The non-static method should be called the static method.
	 *  */

		 // Non-static method
	    public void nonStaticMethod() {
	        System.out.println("Inside non-static method");
	        staticMethod();                // Non-static method calls the static method
	    }

	    // Static method
	    public static void staticMethod() {
	        System.out.println("Inside static method");
	    }
	    public static void main(String[] args) {
	        Program2 obj = new Program2();       // Create object to access non-static method
	        obj.nonStaticMethod();         // Main calls the non-static method
	    }

	   
	}



