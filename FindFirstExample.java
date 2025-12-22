package com.terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstExample {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Guna","Lava","Dhoni","Virat");
		Optional<String> first = list.stream()
										.filter(n->n.length()==5)
										.findFirst();
		System.out.println(first.get());
	}
}
