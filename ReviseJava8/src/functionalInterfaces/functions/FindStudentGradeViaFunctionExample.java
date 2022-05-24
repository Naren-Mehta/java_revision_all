package functionalInterfaces.functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;

	Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

public class FindStudentGradeViaFunctionExample {

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<Student>();

		studentList.add(new Student("naren", 52));
		studentList.add(new Student("bhanu", 70));
		studentList.add(new Student("vickey", 55));

		Function<Student, String> f1 = student -> {
			if (student.marks >= 60) {
				return "A";
			} else if (student.marks >= 45) {
				return "B";
			} else {
				return "C";
			}
		};

		for (Student student2 : studentList) {
			System.out.println(student2.name + " " + f1.apply(student2));
		}

		// Find students's marks >= 55
		Predicate<Student> p1 = s -> s.marks >= 55;
		System.out.println("=====================================");
		for (Student student2 : studentList) {
			if (p1.test(student2)) {
				System.out.println(student2.name + " , marks= " + student2.marks + " grade= "+f1.apply(student2));
			};
		}

	}

}
