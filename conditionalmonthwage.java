

package emp;

import java.util.Scanner;

public class conditionalmonthwage {


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
		int totworkingdays = (int)(Math.floor(Math.random()*30));
		if(totworkingdays>20 ||totworkingdays*8>100)
		{
			switch(empCheck) {
				case 1 :
					System.out.println("Employee is full Present");
					workingHr = 8;
					days = 20;
					sal =  totworkingdays*workingHr*wagePerHr;
					System.out.println("Salary of the employee for a month is "+ sal+" for "+totworkingdays*8+" hours");
					break;
			
				case 2 :
					System.out.println("Employee is part Time present");
					workingHr = 4;
					days = 20;
					sal =  totworkingdays*workingHr*wagePerHr;
					System.out.println("Salary of the employee for a month is "+ sal+ " for "+totworkingdays*4+ " hours");
					break;
		
				default :	
					System.out.println("Thank you...");
					workingHr = 0;
			}
		}
		else
		{
			System.out.println("Employee working hours not exceeded 100 hrs...completed "+totworkingdays*8+"hours");
		}
		}
//		dailyWage = workingHr * wagePerHr;
//		System.out.println("Empolyee daily wage is " + dailyWage);
	}
