package javaTask10_1_26;


	
	class Employee {
	    // Attributes
	    private int employeeId;
	    private String name;
	    private double monthlySalary;

	    // Constructor
	    public Employee(int employeeId, String name, double monthlySalary) {
	        this.employeeId = employeeId;
	        this.name = name;
	        this.monthlySalary = monthlySalary;
	    }

	    // Method to calculate annual salary
	    public double calculateAnnualSalary() {
	        return monthlySalary * 12;
	    }

	    // Method to display employee details
	    public void displayEmployeeDetails() {
	        System.out.println("Employee ID: " + employeeId +
	                           "\n Name: " + name +
	                           " \nMonthly Salary: " + monthlySalary +
	                           " \nAnnual Salary: " + calculateAnnualSalary());
	        System.out.println("--------------------------------------");
	    }
	}

	// Main Program
	public class Main {
	    public static void main(String[] args) {
	        // Create five employee objects
	        Employee e1 = new Employee(201, "Hari", 50000.0);
	        Employee e2 = new Employee(202, "Sravani", 45000.0);
	        Employee e3 = new Employee(203, "Anjali", 60000.0);
	        Employee e4 = new Employee(204, "Ravi", 40000.0);
	        Employee e5 = new Employee(205, "Meena", 55000.0);

	        // Display details
	        e1.displayEmployeeDetails();
	        e2.displayEmployeeDetails();
	        e3.displayEmployeeDetails();
	        e4.displayEmployeeDetails();
	        e5.displayEmployeeDetails();
	    }
	}


