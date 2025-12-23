package com.terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
	public static void main(String[] args) {
		List<Employee> employees=Arrays.asList(
				new Employee("Jaswanth",20000,"Sales"),
				new Employee("Guna",21000,"Accounts"),
				new Employee("Karthik",25000,"IT"),
				new Employee("Bharath",18000,"Sales"),
				new Employee("Sagar",27000,"IT")
				);
		Map<String,List<Employee>> empByDept=employees.stream()
					.collect(Collectors.groupingBy(Employee::getDepartment));
		
		empByDept.forEach((dept,employeeList)->{
			System.out.println("Department:"+dept);
			employeeList.forEach(System.out::println);
		});
	}
}
