package com.te.comparatorassignment.common;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	int studentId;
	String studentName;
	String studentAdress;
	int marks;
	int age;

	public Student(int studentId, String studentName, String studentAdress, int marks, int age) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAdress = studentAdress;
		this.marks = marks;
		this.age = age;
	}

	@Override
	public String toString() {
		return "[Student Id = " + studentId + " , Name = " + studentName + " , Address = " + studentAdress + " , Marks = " + marks + " , Age = " + age + " ]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
