package com.terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByExample {
	public static void main(String[] args) {
		List<Employee> employees=Arrays.asList(
				new Employee("Jaswanth",20000,"Sales"),
				new Employee("Guna",21000,"Accounts"),
				new Employee("Karthik",25000,"IT"),
				new Employee("Bharath",18000,"Sales"),
				new Employee("Sagar",27000,"IT")
				);
		Map<Boolean,List<Employee>> map=employees.stream()
				.collect(Collectors.partitioningBy(e->e.getSalary()>20000));
		System.out.println("Employees getting salary > 20000 are:");
		for(Employee e:map.get(true)) {
			System.out.println(e);
		}
		System.out.println("Employees getting salary <= 20000 are:");
		for(Employee e:map.get(false)) {
			System.out.println(e);
		}
		//or
		
//		map.get(true).forEach(System.out::println);
//		map.get(false).forEach(System.out::println);
	}
}
