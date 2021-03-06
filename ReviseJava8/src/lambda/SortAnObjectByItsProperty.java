package lambda;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return id+ ":"+name;
	}
}

public class SortAnObjectByItsProperty {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(100, "saktiman"));
		al.add(new Employee(50, "kabala"));
		al.add(new Employee(11, "gangadhar"));
		al.add(new Employee(55, "geeta"));
		al.add(new Employee(36, "viswash"));
		al.add(new Employee(71, "kilvis"));
		System.out.println(al);

		Collections.sort(al,(e1, e2)-> (e1.id < e2.id) ? -1 : (e1.id > e2.id) ? 1 : 0);
		System.out.println(al);

	}

}
