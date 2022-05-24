package functionalInterfaces.premitiveConsumer;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;

class Employee {
	String name;
	int age;
	double salary;
	
	Employee(String name, int age, double salary){
		this.name = name;
		this.age= age;
		this.salary= salary;
	}
	
	public String toString() {
		return this.name + " age: "+this.age + " Salary: "+ this.salary;
	}
}
public class PremitiveConsumerExamples {

	public static void main(String[] args) {

		
		Consumer<Integer> c1 = i -> System.out.println(i*i);
		c1.accept(10);
		
		
		IntConsumer ic1 = i-> System.out.println(i*i);
		LongConsumer lc1 = l-> System.out.println(l*l);
		DoubleConsumer dc1 = d-> System.out.println(d*d);
		
		
		ic1.accept(133);
		lc1.accept(200l);
		dc1.accept(10.2d);
		
		Employee e1 = new Employee("Naren", 30, 45000.5d);
		
		//Update age
		ObjIntConsumer<Employee> objIC1 = (emp, age) -> emp.age = age;
		
		objIC1.accept(e1, 32);
//		System.out.println(e1.age);
		
		// Update salary
		ObjDoubleConsumer<Employee> objDC1 = (emp, amount) -> emp.salary =emp.salary + amount;
		objDC1.accept(e1, 250.5d);
		
		System.out.println(e1);
	}

}
