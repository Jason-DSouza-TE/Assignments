package com.te.arrayassignments.common;

import java.util.Arrays;

public class ArrayShortcuts {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = new int[9];
		System.out.println(Arrays.toString(b) + " is array B before copying");
		System.out.println("----------------");

		// Copying Array
		System.arraycopy(a, 0, b, 2, a.length);
		System.out.println(Arrays.toString(a) + " is array A");
		System.out.println(Arrays.toString(b) + " is array B after copying");

		// Iterator Array
		for (int i : b) {
			System.out.println(i);
		}
	}
}
