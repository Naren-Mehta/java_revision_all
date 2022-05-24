package functionalInterfaces.biConsumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

class Employee {
	String name;
	Double salary;

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return this.name + " salary " + this.salary;
	}
}

public class BiConsumerExample {

	public static void main(String[] args) {

		Consumer<String> c1 = s1 -> System.out.println(s1);
		c1.accept("test");

		BiConsumer<String, String> bc1 = (s1, s2) -> System.out.println(s1 + " " + s2);
		bc1.accept("naren", "mehta");

		// ===============================

		BiFunction<String, Double, Employee> bf1 = (name, salary) -> new Employee(name, salary);
		BiConsumer<Employee, Double> bc2 = (emp, incSalary )-> emp.salary+= incSalary;
				
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(bf1.apply("naren", 10000000d));
		al.add(bf1.apply("singh", 500000d));
		al.add(bf1.apply("mehta", 700000d));
		al.add(bf1.apply("testing", 800000d));
		al.add(bf1.apply("abc", 900000d));

		System.out.println(al);

		for(Employee e: al) {
			bc2.accept(e, 20000d);
		}
		
		System.out.println(al);
		
		
	}

}
