package javaTask6_1_2026;


/* 
 * 1.	Write a program based on the following requirements:
○ 	Create a main method.
○ 	Create two non-static methods.
○ 	The main method should call the first non-static method.
○ 	The first non-static method should call the second non-static method.

 *    */
public class Program1 {
	// First non-static method
    public void firstMethod() {
        System.out.println("Inside first non-static method");
        secondMethod();            // First calls the second non-static method
    }

    // Second non-static method
    public void secondMethod() {
        System.out.println("Inside second non-static method");
    }
    public static void main(String[] args) {
        Program1 obj = new Program1();   // Create object to access non-static methods
        obj.firstMethod();         // Main calls the first non-static method
    }

    
    
    }


