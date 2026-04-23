package javaTask6_1_2026;
/*
 * 3.	Write a program based on the following requirements:
○ 	Create a static method.
○ 	Create two non-static methods.
○ 	Create a main method.
○ 	The second non-static method should call both the static method and the first non-static method.
○ 	The main method should call the second non-static method.

 * */
public class program3 {
	
	   

	    // First non-static method
	    public void firstMethod() {
	        System.out.println("Inside first non-static method");
	    }

	    // Second non-static method
	    public void secondMethod() {
	        System.out.println("Inside second non-static method");
	        firstMethod();                 // Call the first non-static method
	        staticMethod();                // Call the static method
	    }

	    // Static method
	    public static void staticMethod() {
	        System.out.println("Inside static method");
	    }
	
	    public static void main(String[] args) {
	        program3 obj = new program3();       // Create object to access non-static methods
	        obj.secondMethod();            // Main calls the second non-static method
	    }
}
