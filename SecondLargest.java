package com.te.arrayassignments.common;

public class SecondLargest {
	public static void main(String[] args) {
		int[] a1 = { 7, 8, 12, 25,34,34,34,34, 34, 34, 34, 32, 32, 22 };
		int temp;
		int b = 0;
		boolean flag = false;
		for (int i = 0; i < a1.length - 1; i++) {
			for (int j = i + 1; j < a1.length; j++) {
				if (a1[j] < a1[i]) {
					temp = a1[i];
					a1[i] = a1[j];
					a1[j] = temp;
				}
			}
		}

		for (int e = a1.length - 1; e >= 0; e--) {
				if (a1[e-1] != a1[e]) {
				System.out.println(a1[e-1]);
				break;
				}
				}
		
	}
}
