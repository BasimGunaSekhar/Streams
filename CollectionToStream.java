package com.convertingIntoStream;

import java.util.Arrays;
import java.util.List;

public class CollectionToStream {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Ram","Bheem");
		list.stream().forEach(n->System.out.println(n));
	}
}
