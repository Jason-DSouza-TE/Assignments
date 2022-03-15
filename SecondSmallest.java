package com.te.arrayassignments.common;

import java.util.Arrays;

public class SecondSmallest {
	public static void main(String[] args) {
		int[] a1 = { 4, 46, 37, 54, 39, 37, 4, 4, 4, 774, 6535, 47 };
		int temp;
		// for sorting in descending order;

		for (int i = 0; i < a1.length - 1; i++) {
			for (int j = i + 1; j < a1.length; j++) {
				if (a1[j] > a1[i]) {
					temp = a1[i];
					a1[i] = a1[j];
					a1[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a1) + " is the sorted array");
		System.out.println("---------------");

//		 to find second smallest number when smallest number is repeated
		for (int e = a1.length - 1; e >= 0; e--) {
			if (a1[e - 1] != a1[e]) {
				System.out.println(a1[e - 1] + " is the second smallest");
				break;
			}
		}
	}
}
