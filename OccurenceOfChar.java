package com.problemsUsingStream;

import java.util.stream.Collectors;

public class OccurenceOfChar {
	public static void main(String[] args) {
		String str="javadeveloper";
		str.chars().mapToObj(n->(char)n)
			.collect(Collectors.groupingBy(n->n,Collectors.counting()))
			.forEach((a,b)->System.out.println(a+"->"+b));
	}
}
