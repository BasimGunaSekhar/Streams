package com.intermediateOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedExample {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(3,5,2,4,6,1);
		//Ascending
		list.stream()
				.sorted()
				.forEach(System.out::print);
		
		System.out.println();
		//Descending
		list.stream()
				.sorted(Comparator.reverseOrder())
				.forEach(System.out::print);
		
		System.out.println();
	}
}
