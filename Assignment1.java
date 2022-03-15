package com.te.assignments.common;

public class Assignment1 {
	import java.util.Scanner;

	public class NewAssignment {

		public static void main(String[] args) {
			boolean flag = true;
			int i = 0;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter month");
			String month = scanner.next();
			System.out.println("Enter year");
			int year = scanner.nextInt();
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	System.out.println(year + " is a leap year and the number of days in the month " + month + " is ");
			} else {
				flag = false;
				System.out.println(year + " is not a leap year and the number of days in the month of " + month + " is ");
			}
		
			switch (month) {
			case "January": {
				System.out.println("31");
				break;
			}
			case "February": {
				if (flag) {
					System.out.println("29");
					break;
				}
				else {
					System.out.println("28");
					break;
				}
			}
			case "March": {
				System.out.println("31");
				break;
			}
			case "April": {
				System.out.println("30");
				break;
			}
			case "May": {
				System.out.println("31");
				break;
			}
			case "June": {
				System.out.println("30");
				break;
			}
			case "July": {
				System.out.println("31");
				break;
			}
			case "August": {
				System.out.println("31");
				break;
			}
			case "September": {
				System.out.println("30");
				break;
			}
			case "October": {
				System.out.println("31");
				break;
			}
			case "November": {
				System.out.println("30");
				break;
			}
			case "December": {
				System.out.println("31");
				break;
			}}}}

}
