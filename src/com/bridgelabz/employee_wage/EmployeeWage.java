package com.bridgelabz.employee_wage;

public class EmployeeWage {

	public static void main(String[] args) {


		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		if(empCheck == 0)
		{
			System.out.println("Employee is Present");
		}
		else

		{
			System.out.println("Employee is Absent");
		}



		int wagePerHour = 20;
		int fullDay = 8;
		System.out.println("===== WELCOME TO EMPLOYEE WAGE COMPUTATION ======");
		System.out.println("");

		int empCheck1 = (int) Math.floor(Math.random() * 10) % 2;
		if(empCheck1 == 0)
		{
			System.out.print("Employee is Present");
			System.out.println("");
			System.out.print("The daily wage of Employee is : " + ( wagePerHour * fullDay ));
			System.out.println("");
		}
		else
		{
			System.out.print("Employee is Absent");
			System.out.println("");
			System.out.println("The daily wage of Employee is : 0 " );
			System.out.println("");
		}
		
		
		

		/*! UC3*/
		
		 int wagePerHour1 = 20;
       int fullDay1 = 8;
       int halfDay = 4;
       System.out.println("===== WELCOME TO EMPLOYEE WAGE COMPUTATION ======");
       System.out.println("");

       int empCheck2 = (int) Math.floor(Math.random() * 10) % 3;
       if( empCheck2 == 0 )
       {
           System.out.print("Employee is Present");
           System.out.println("");
           System.out.print("The daily wage of Employee is : " + ( wagePerHour1 * fullDay1 ));
           System.out.println("");
       }

       else if ( empCheck2 == 1 )

       {
           System.out.print("Employee is Present but working part time ");
           System.out.println("");
           System.out.print("The daily wage of Employee is : " + ( wagePerHour1 * halfDay ));
           System.out.println("");
       }
       else
       {
           System.out.print("Employee is Absent");
           System.out.println("");
           System.out.println("The daily wage of Employee is : 0 " );
           System.out.println("");
       }

	}
}
