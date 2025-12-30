package com.intermediateOperations;

import java.util.List;
import java.util.stream.Stream;

public class DistinctExample {
	public static void main(String[] args) {
		String[] names= {"Cat","Cat","Dog","cat","dog","dog"};
		List<String> res=Stream.of(names).distinct().toList();
		System.out.println(res);
	}
}
