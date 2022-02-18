package emp;

import java.util.Scanner;

public class monthwage {


	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation page");
		
		int isFullTime = 1;
		int isPartTime = 2;
		int dailyWage;
		int wagePerHr = 20;
		int workingHr;
		int sal;
		int days;
		
		
		int empCheck= (int)(Math.floor(Math.random() *10)) %3;
			
		switch(empCheck) {
			case 1 :
				System.out.println("Employee is full Present");
				workingHr = 8;
				days = 20;
				sal =  days*workingHr*wagePerHr;
				System.out.println("Salary of the employee for a month is "+ sal);
				break;
			
			case 2 :
				System.out.println("Employee is part Time present");
				workingHr = 4;
				days = 20;
				sal =  days*workingHr*wagePerHr;
				System.out.println("Salary of the employee for a month is "+ sal);
				break;
		
			default :	
				System.out.println("Thank you...");
				workingHr = 0;
		}
		
//		dailyWage = workingHr * wagePerHr;
//		System.out.println("Empolyee daily wage is " + dailyWage);
	}

}