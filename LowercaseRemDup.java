package com.problemsUsingStream;

import java.util.Arrays;
import java.util.List;

public class LowercaseRemDup {
	public static void main(String[] args) {
		String[] names= {"Adam","Bob","Charan","adam","charan"};
		List<String> result=Arrays.stream(names)
									.map(n->n.toLowerCase())
									.distinct()
									.sorted()
									.toList();
		System.out.println(result);
	}
}
