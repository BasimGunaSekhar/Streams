package com.intermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		List<Integer> sqList=list.stream()
				.peek(n->System.out.println(n))
				.map(n->n*n)
				.peek(System.out::println)
				.collect(Collectors.toList());
		System.out.println(sqList);
	}
}
