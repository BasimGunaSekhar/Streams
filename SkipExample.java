package com.intermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipExample {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(3,1,5,4,2);
		List<Integer> result=list.stream()
									.skip(2)
									.collect(Collectors.toList());
		System.out.println(result);
	}
}
