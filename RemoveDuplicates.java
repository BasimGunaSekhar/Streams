package com.streams;

import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String s="javadeveloper";
		String result=s.chars()
				.distinct()
				.mapToObj(n->String.valueOf((char)n))
				.collect(Collectors.joining());
		System.out.println(result);
	}
}
