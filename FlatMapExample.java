package com.intermediateOperations;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
	public static void main(String[] args) {
		List<List<String>> listOfLists=Arrays.asList(
					Arrays.asList("a","b"),
					Arrays.asList("c","d"),
					Arrays.asList("e","f")
				);
		listOfLists.stream()
				.flatMap(list->list.stream())
				.forEach(n->System.out.println(n));
	}
}
