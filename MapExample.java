package com.intermediateOperations;

import java.util.Arrays;
import java.util.List;

public class MapExample {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Guna","Karthik","Jaswanth","Bharath");
		list.stream()
				.map(n->n.toUpperCase())
				.forEach(n->System.out.println(n));
	}
}
