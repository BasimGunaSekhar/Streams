package com.problemsUsingStream;

import java.util.stream.Collectors;

public class RemoveDupChar {
	public static void main(String[] args) {
		String s="gunasekhar";
		String result=s.chars()
				.distinct()
				.mapToObj(n->String.valueOf((char)n))
				.collect(Collectors.joining());
		System.out.println(result);
	}
}
