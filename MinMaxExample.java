package com.terminalOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMaxExample {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		
		Optional<Integer> min =list.stream().min(Comparator.naturalOrder());
		System.out.println("min:"+min.get());
		
		Optional<Integer> max =list.stream().max(Comparator.naturalOrder());
		System.out.println("max:"+max.get());
	}
}
