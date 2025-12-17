package com.streams;

import java.util.stream.Collectors;

public class Occurrence {
	public static void main(String[] args) {
		String s="javadev";
		s.chars().mapToObj(n->(char)n)
		.collect(Collectors.groupingBy(n->n,Collectors.counting()))
		.forEach((a,b)->System.out.println(a+"->"+b));
	}
}
