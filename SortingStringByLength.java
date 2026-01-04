package com.intermediateOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingStringByLength {
	public static void main(String[] args) {
		
		//Ascending
		List<String> list=Arrays.asList("Ajay","Bharath","Charan","Dinesh","Fahad");
		List<String> ascOrder=list.stream()
								.sorted(Comparator.comparingInt(n->n.length()))
								.collect(Collectors.toList());
		System.out.println(ascOrder);
		
		//Descending
		List<String> descOrder=list.stream()
						.sorted(Comparator.comparingInt(String::length).reversed())
						.collect(Collectors.toList());
		System.out.println(descOrder);
	}
}
