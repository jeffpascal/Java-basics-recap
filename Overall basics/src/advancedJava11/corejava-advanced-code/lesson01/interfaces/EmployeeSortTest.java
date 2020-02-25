package interfaces;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeSortTest {
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];

		staff[0] = new Employee("Harry Hacker", 75000);
		staff[1] = new Employee("Carl Cracker", 74000);
		staff[2] = new Employee("Tony Tester", 38000);
		class OtherComparator implements Comparator<Employee> {
			public int compare(Employee o, Employee o2) {
				System.out.println("Compared " + o + " to " + o2);
				return o.getName().compareTo(o2.getName());
			}
		}
		
		Arrays.sort(staff, new OtherComparator());
		
		System.out.println(Arrays.toString(staff));
	}
}