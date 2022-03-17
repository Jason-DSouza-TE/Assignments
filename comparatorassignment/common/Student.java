package com.te.comparatorassignment.common;

import java.util.Objects;

public class Student {
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
	public int hashCode() {
		return Objects.hash(studentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		
		if (studentId != other.studentId)
			return false;
		return true;
	
	

	
	}}

