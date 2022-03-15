package com.te.comparatorassignment.common;

import java.util.Comparator;

public class CompareByMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.marks-o2.marks;
	}

}
