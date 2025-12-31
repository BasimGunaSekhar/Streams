package com.intermediateOperations;

import java.util.Arrays;

public class FilterExample {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8};
		Arrays.stream(a)
				.filter(n->n%2==0)
				.forEach(n->System.out.println(n));
	}
}
