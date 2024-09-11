package com.bridgelabz.employee_wage;

import java.util.Scanner;

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



		/*UC4*/

		int wagePerHour4 = 20;
		int fullDay4 = 8;
		int halfDay4 = 4;
		System.out.println("===== WELCOME TO EMPLOYEE WAGE COMPUTATION ======");
		System.out.println("");

		int empCheck4 = (int) Math.floor(Math.random() * 10) % 3;
		switch ( empCheck4 ) {
		case 0:
			System.out.print("Employee is Present");
			System.out.println("");
			System.out.print("The daily wage of Employee is : " + (wagePerHour4 * fullDay4));
			System.out.println("");
			break;

		case 1:
			System.out.print("Employee is Present but working part time ");
			System.out.println("");
			System.out.print("The daily wage of Employee is : " + (wagePerHour4 * halfDay4));
			System.out.println("");
			break;

		case 2:
			System.out.print("Employee is Absent");
			System.out.println("");
			System.out.println("The daily wage of Employee is : 0 ");
			System.out.println("");
			break;

		}


		/*UC5*/

		int wagePerHour5 = 20;
		int fullDay5 = 8;
		int halfDay5 = 4;
		int totalNoOfDays = 20;
		System.out.println("===== WELCOME TO EMPLOYEE WAGE COMPUTATION ======");
		System.out.println("");

		int empCheck5 = (int) Math.floor(Math.random() * 10) % 3;
		switch ( empCheck5 ) {
		case 0:
			System.out.print("Employee is Present");
			System.out.println("");
			System.out.print("The daily wage of Employee is : " + ( wagePerHour5 * fullDay5 * totalNoOfDays ));
			System.out.println("");
			break;

		case 1:
			System.out.print("Employee is Present but working part time ");
			System.out.println("");
			System.out.print("The daily wage of Employee is : " + ( wagePerHour5 * halfDay5 * totalNoOfDays ));
			System.out.println("");
			break;

		case 2:
			System.out.print("Employee is Absent");
			System.out.println("");
			System.out.println("The daily wage of Employee is : 0 ");
			System.out.println("");
			break;

		}

		/*UC6*/


		int wagePerHour6 = 20;
		int fullDay6 = 8;
		int halfDay6 = 4;
		int totalNoOfDays6=0;
		int dailyWage = 0;
		int monthlyWage = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("===== WELCOME TO EMPLOYEE WAGE COMPUTATION ======");
		System.out.println("");
		System.out.print("Enter the number of days you were supposed to work ( between 1 -20 ): ");
		totalNoOfDays = sc.nextInt();
		int totalHours = totalNoOfDays6 * fullDay6;
		int counter = 0;
		for (int i = 1; i <= totalNoOfDays6; i++) {

			int empCheck6 = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck6) {
			case 0:

				System.out.println("Employee is Present on day and is working full time : " + i);
				dailyWage = wagePerHour6 * fullDay6;
				System.out.println("The daily wage of Employee is : " + dailyWage);
				System.out.println(" \n ");
				counter = counter + 1;
				break;

			case 1:
				System.out.print("Employee is Present but working part time on day : " + i);
				System.out.println("");
				dailyWage = wagePerHour6 * halfDay6;
				System.out.println("The daily wage of Employee is : " + dailyWage);
				System.out.println(" \n ");
				break;

			case 2:
				System.out.println("Employee is Absent on day :" + i);
				dailyWage = 0;
				System.out.println("The daily wage of Employee is : " + dailyWage);
				System.out.println(" \n ");
				break;
			}

			monthlyWage = monthlyWage + dailyWage;
		}
		System.out.println("\n");
		if(totalHours >= 100 || counter >= 20) {
			System.out.println("The monthly wage of employee is : " + monthlyWage);
		}
		else
		{
			System.out.println("The monthly wage of employee is : " + monthlyWage);
		}

	}

	/*UC7*/



	class EmployeeWageComputation {
		int wagePerHour;
		int fullDay;
		int halfDay;
		int dailyWage;
		int monthlyWage;
		int counter1;
		int totalHourPresnt;
		int totalhourPartTime;
		int totalHourAbsent;
		int empCheck;
		int totalHours;
		EmployeeWageComputation() {

			this.wagePerHour = 20;
			this.fullDay = 8;
			this.halfDay = 4;
			this.dailyWage = 0;
			this.monthlyWage = 0;
			this.counter1 = 0;
			this.totalHourPresnt = 0;
			this.totalhourPartTime = 0;
			this.totalHourAbsent = 0;
			this.totalHours = 0;

		}
		void attendanceCheck() {

			this.empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (this.empCheck) {
			case 0:

				System.out.println("Employee is Present  and is working full time ");
				this.totalHourPresnt = this.totalHourPresnt + 8;
				break;

			case 1:
				System.out.println("Employee is Present but working part time");
				this.totalhourPartTime = this.totalhourPartTime + 4;
				break;

			case 2:
				System.out.println("Employee is Absent");
				this.totalHourAbsent = 0;
				break;
			}
		}

		void dailyWage() {
			if (empCheck == 0) {
				dailyWage = wagePerHour * fullDay;
				System.out.println("The daily wage of Employee is : " + dailyWage);
				System.out.println(" \n ");
			} else if (empCheck == 1) {
				dailyWage = wagePerHour * halfDay;
				System.out.println("The daily wage of Employee is : " + dailyWage);
				System.out.println(" \n ");
			} else {
				dailyWage = 0;
				System.out.println("The daily wage of Employee is : " + dailyWage);
				System.out.println(" \n ");
			}
			//  System.out.println(totalHours);

		}

		void monthlyWage() {

			monthlyWage = monthlyWage + dailyWage;
			totalHours = totalHourPresnt + totalhourPartTime ;

		}


		void monthlyWageCondition() {

			if (counter1 >= 20 || totalHours >= 100) {
				System.out.println("Total working hour while employee is working Full time :" + totalHourPresnt);
				System.out.println("Total working hour while employee is working Part time :" + totalhourPartTime);
				System.out.println("Total working hour while employee is Absent :" + totalHourAbsent);
				System.out.println("The monthly wage is: " + monthlyWage);
			} else {
				System.out.println("Total working hour while employee is working Full time :" + totalHourPresnt);
				System.out.println("Total working hour while employee is working Part time :" + totalhourPartTime);
				System.out.println("The total hours employee worked is: " + totalHours);
				System.out.println("The monthly wage is: " + monthlyWage);
			}
		}
	}
	public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int totalNoOfDays;
			System.out.println("===== WELCOME TO EMPLOYEE WAGE COMPUTATION ======");
			System.out.println("");
			System.out.print("Enter the number of days you were supposed to work ( between 1 -20 ): ");
			totalNoOfDays = sc.nextInt();
			EmployeeWage e = new EmployeeWage();
			EmployeeWageComputation e1 = e.new EmployeeWageComputation();

			for (int i = 1; i <= totalNoOfDays; i++) {
				System.out.println("The day is :" + i);
				e1.attendanceCheck();
				e1.dailyWage();
				e1.monthlyWage();
			}

			e1.monthlyWageCondition();
		}
	}

}






