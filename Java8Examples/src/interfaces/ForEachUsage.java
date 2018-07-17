package interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import pojos.Employee;

public class ForEachUsage {

	public static void main(String[] args) {

		List<Employee>  employeeList = Arrays.asList(
				new Employee(1,"Roger","Chennai",30000),
				new Employee(2,"Billy","Gurgaon",70000),
				new Employee(3,"Chris","Hyderabad",40000),
				new Employee(4,"Marky","Pune",60000),
				new Employee(5,"Harry","Mumbai",50000)
				);
		
		/*Usage of forEach on the list*/
		employeeList.forEach(s -> System.out.println(s.toString()));
		
		/* Using Collections API sort method to compare employee objects*/
		Collections.sort(employeeList, (e1,e2) -> e1.getName().compareTo(e2.getName()));
		employeeList.forEach(s -> System.out.println(s.toString()));
		
		/* Using Collections API sort method to compare employee objects with method reference*/
		Collections.sort(employeeList, Employee::compareBySal);
		employeeList.forEach(s -> System.out.println(s.toString()));
	}
}
