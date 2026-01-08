package com.convertingIntoStream;

import java.util.Arrays;

public class PrimitiveTypeArrayToStream {
	public static void main(String[] args) {
		int[] primitiveArray= {1,2,3,4,5};
		Arrays.stream(primitiveArray)
		.forEach(n->System.out.println(n));
	}
}
