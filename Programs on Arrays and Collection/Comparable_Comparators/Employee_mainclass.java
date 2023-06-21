package Comparable_Comparators;

import java.util.Arrays;

public class Employee_mainclass {
	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "NAGARAJA", "nagarajsaralikatti2022@gmail.com", 35000, 2134567910);
		Employee employee2 = new Employee(3, "MANJU", "nagarajnags333@gmail.com", 25000, 123456890);
		Employee employee3 = new Employee(5, "NAVEEN", "naveen@gmail.com", 35000, 0101010101);
		Employee employee4 = new Employee(4, "RAJ", "raj123@gmail.com", 45000, 2020202020);
		Employee employee5 = new Employee(6, "ABHI", "abhi56@gmail.com", 55000, 858545610);
		Employee employee6 = new Employee(2, "RAVI", "ravi@gmail.com", 15000, 1234567891);

		Employee arr[] = { employee1, employee2, employee3, employee4, employee5, employee6 };

		Arrays.sort(arr);
		
		for (Employee o : arr) {
			System.out.println(o);
		}

	}

}
