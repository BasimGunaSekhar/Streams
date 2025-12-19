package com.streams;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesInList {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Java","java","AI","Java","Python","ai","ML");
		List<String> result=list.stream().map(n->n=n.toLowerCase()).distinct().sorted().toList();
		System.out.println(result);
	}
}
