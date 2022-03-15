package com.te.comparatorassignment.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.te.comparator.common.CompapareById;

public class Studenttest {
	public static void main(String[] args) {
		boolean flag = true;
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(1, "Aaron", "sikkim", 80, 15));
		arrayList.add(new Student(2, "Chris", "Assam", 90, 13));
		arrayList.add(new Student(3, "Stewie", "Mirzapur", 65, 16));
		arrayList.add(new Student(4, "Meg", "Bangalore", 67, 17));
		arrayList.add(new Student(5, "Peter", "Chennai", 68, 18));
		arrayList.add(new Student(6, "Louis", "Mumbai", 69, 19));
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter 1 to sort by ID");
			System.out.println("Enter 2 to sort by Name");
			System.out.println("Enter 3 to sort by Address");
			System.out.println("Enter 4 to sort by Marks");
			System.out.println("Enter 5 to sort by Age");
			int z = scanner.nextInt();
			switch (z) {
			case 1:
				Collections.sort(arrayList, new CompareById());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;

			case 2:
				Collections.sort(arrayList, new CompareByName());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;

			case 3:
				Collections.sort(arrayList, new CompareByAddress());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;

			case 4:
				Collections.sort(arrayList, new CompareByMarks());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;

			case 5:
				Collections.sort(arrayList, new CompareByAge());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;
			default:
				System.out.println("Error!!! : Please enter a value between 1 to 5 ");
				continue;
			}
			Scanner sc1 = new Scanner(System.in);
			System.out.println();
			System.out.println("If you wish to continue, type YES");
			System.out.println("If you wish to quit, type NO");
			String str = sc1.next();
			if (str.equalsIgnoreCase("yes")) {
				flag = true;
			} else if (str.equalsIgnoreCase("no")) {
				flag = false;
				System.out.println("Program Terminated. Thank you");
			} else {
				System.out.println("Error!!! : Please type only YES or NO ");
			}
		} while (flag);
	}
}
