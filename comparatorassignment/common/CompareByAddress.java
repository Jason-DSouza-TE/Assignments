package com.te.comparatorassignment.common;

import java.util.Comparator;

public class CompareByAddress implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.studentAdress.compareTo(o2.studentAdress);
	}

}
