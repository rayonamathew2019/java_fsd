package ustbatchno3.Sonarqube;

import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
import java.util.List;
//import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Salary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(25, "Sanju", 2, 30000));
		employees.add(new Employee(48, "raju", 8, 80000));
		employees.add(new Employee(39, "zahr", 12, 100000));
		employees.add(new Employee(54, "luhu", 4, 50000));

		List<Employee> lis = employees.stream().peek(t -> {
			if (t.getExp() >= 1 && t.getExp() <= 2)
				t.setSalary(t.getSalary() + 0.25 * t.getSalary());
			else if (t.getExp() >= 3 && t.getExp() <= 6)
				t.setSalary(t.getSalary() + 0.05 * t.getSalary());
			else if (t.getExp() >= 6 && t.getExp() <= 10)
				t.setSalary(t.getSalary() + 0.1 * t.getSalary());
			else
				t.setSalary(t.getSalary() + 0.12 * t.getSalary());
		}).toList();


		employees.forEach(t -> System.out.println("Incremented Salary is   : " + t.getSalary()));


	}
}
