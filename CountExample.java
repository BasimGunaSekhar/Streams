package com.terminalOperations;

import java.util.Arrays;
import java.util.List;

public class CountExample {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		Long count=list.stream()
						.filter(n->n%2==0)
						.count();
		System.out.println(count);
	}
}
