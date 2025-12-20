package com.terminalOperations;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Guna","Lava","Dhoni","Virat");
		Boolean b=list.stream().anyMatch(n->n.length()==4);
		System.out.println(b);
	}
}
