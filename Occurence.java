package com.problemsUsingStream;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Occurence {
	public static void main(String[] args) {
		String str="javadeveloper";
		str.chars()
			.mapToObj(n->(char)n)
			.collect(Collectors.groupingBy(n->n,Collectors.counting()))
			.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByValue())
			.forEach(a->System.out.println(a.getKey()+"->"+a.getValue()));
		
		System.out.println("=====================");
		//Another way to sort based on key,Using TreeMap we can sort Based on Key Only
		str.chars()
			.mapToObj(n->(char)n)
			.collect(Collectors.groupingBy(n->n,TreeMap::new,Collectors.counting()))
			.forEach((a,b)->System.out.println(a+"->"+b));
	}
}
