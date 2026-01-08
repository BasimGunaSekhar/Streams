package com.convertingIntoStream;

import java.util.stream.Stream;

public class NonPrimitiveTypeArrayToStream {
	public static void main(String[] args) {
		Integer[] nonPrimitiveArray= {1,2,3,4,5};
		Stream.of(nonPrimitiveArray)
			.forEach(n->System.out.println(n));
	}
}
