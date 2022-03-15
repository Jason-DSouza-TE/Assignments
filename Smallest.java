package com.te.arrayassignments.common;

public class Smallest {
	public static void main(String[] args) {
		int[] a1 = {5,48,377,2,3,44,5,6 };
		int temp;
		for (int i = 0; i < a1.length - 1; i++) {
			for (int j = i + 1; j < a1.length; j++) {
				if (a1[j] < a1[i]) {
					temp = a1[i];
					a1[i] = a1[j];
					a1[j] = temp;
				}
			}
		}
		System.out.println(a1[0]);
	}
}
