package com.intermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitExample {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Ajay","Bharath","Charan","Dinesh","Fahad");
		List<String> result=list.stream()
									.limit(3)
									.collect(Collectors.toList());
		System.out.println(result);
	}
}
