package javaTask_06_01_2026;

public class AssignmentMain {
    public static void main(String[] args) {
        Program1 obj1 = new Program1();
        obj1.firstMethod();

        Program2 obj2 = new Program2();
        obj2.nonStaticMethod();

        Program3 obj3 = new Program3();
        obj3.secondMethod();
    }
}

class Program1 {
    public void firstMethod() {
        System.out.println("Program1: first non-static");
        secondMethod();
    }
    public void secondMethod() {
        System.out.println("Program1: second non-static");
    }
}

class Program2 {
    public void nonStaticMethod() {
        System.out.println("Program2: non-static");
        staticMethod();
    }
    public static void staticMethod() {
        System.out.println("Program2: static");
    }
}

class Program3 {
    public void firstMethod() {
        System.out.println("Program3: first non-static");
    }
    public void secondMethod() {
        System.out.println("Program3: second non-static");
        firstMethod();
        staticMethod();
    }
    public static void staticMethod() {
        System.out.println("Program3: static");
    }
}
