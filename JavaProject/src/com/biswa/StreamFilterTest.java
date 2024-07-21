package com.biswa;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFilterTest {

	public static void main(String[] args) {

		List<Employee> employeesList = Arrays.asList(
                new Employee(1, "Alex", 100),
                new Employee(2, "Brian", 100),
                new Employee(3, "Biswa", 200),
                new Employee(4, "Aditri", 200),
                new Employee(5, "Deepika", 300),
                new Employee(6, "Saumya", 300)
        );
		Optional<Employee> emp=employeesList.stream().filter(data->data.getId()==7).findAny();
		if(emp.isPresent())
		System.out.println(" "+emp.get().getName());
	}

}
