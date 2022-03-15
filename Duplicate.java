package com.te.arrayassignments.common;

import java.util.Iterator;

public class Duplicate {
	public static void main(String[] args) {
		int[] a1 = { 1, 1, 5, 1, 2, 3, 4, 5, 4, 6, 2, 2, 3 };
		int i; int j;

		for (i = 0; i < a1.length; i++) {
			int count = 0;
			for (j = 0; j < a1.length; j++) {
				if (a1[i] == a1[i] && i != j) {
					count++;
					a1[i] = '\n';
				}
			}
			if (a1[j] != '\n' && count > 0) {
				System.out.println(a1[i] + " ");
			}
			if (count <= 0) {
				System.out.println("No duplicate value present");
			}
		}
	}
}
