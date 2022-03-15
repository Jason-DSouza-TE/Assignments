package com.te.arrayassignments.common;

import java.util.Arrays;

public class Largest {
	public static void main(String[] args) {
		int[] a1 = { 2, 1, 3, 5, 7, 4 }; 
		int temp;
		for(int i=0;i<a1.length-1;i++) {
			for(int j=i+1;j<a1.length;j++) {
				if (a1[j]<a1[i]) {
				temp = a1[i];
				a1[i]=a1[j];
				a1[j]=temp;
			}
		}

	}
		System.out.println(a1[a1.length-1]);
	}
}
