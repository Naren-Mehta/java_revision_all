package functionalInterfaces.biFunction;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Student {
	String name;
	int rollno;
	
	public Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
	
	public String toString() {
		return this.name + " " + this.rollno;
	}
}
public class StudentExample {

	public static void main(String[] args) {

		BiFunction<String, Integer, Student> bf1 = (s1, i1)-> new Student(s1, i1);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(bf1.apply("naren", 20));
		al.add(bf1.apply("singh", 22));
		al.add(bf1.apply("mehta", 23));
		al.add(bf1.apply("megha", 24));
		
		System.out.println(al);
		
	}

}
