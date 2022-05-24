package functionalInterfaces.functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String name;
	double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return this.name + " " + this.salary;
	}
}

public class TotalMonthlySalaryOfAllEmployeesExample {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee("naren", 4900));
		empList.add(new Employee("bhanu", 9000));
		empList.add(new Employee("vickey", 4500));

		Function<ArrayList<Employee>, Double> f1 = list -> {
			Double totalSalary = 0d;
			for (Employee e : list) {
				totalSalary += e.salary;
			}
			return totalSalary;
		};

		System.out.println(f1.apply(empList));

		Predicate<Employee> p1 = emp -> emp.salary < 5000;
		Function<Employee, Employee> f2 = emp -> {
			emp.salary += 1000;
			return emp;
		};
		
		System.out.println(empList);

		
		for(Employee emp: empList) {
			System.out.println(emp+ " "+p1.test(emp));
			if(p1.test(emp)) {
				f2.apply(emp);
			}
		}
		
		System.out.println(empList);

	}

}
