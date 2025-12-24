package com.terminalOperations;

import java.util.Arrays;
import java.util.List;

public class SumExample {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		Integer sum=list.stream()
						.filter(n->n%2==0)
						.mapToInt(Integer::intValue)
						.sum();
		System.out.println(sum);
	}
}
