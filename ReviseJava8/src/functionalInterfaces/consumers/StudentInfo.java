package functionalInterfaces.consumers;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;
	
	Student(String name, int marks){
		this.name = name;
		this.marks = marks;
	}
}
public class StudentInfo {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("Naren", 60));
		al.add(new Student("Vijay", 80));
		al.add(new Student("Sachin", 90));
		al.add(new Student("Pawan", 30));
		al.add(new Student("Ramesh", 20));
		al.add(new Student("Suresh", 40));

		Predicate<Student> p1 = st-> st.marks >=60;
		Function<Student, String> f1 = stu-> {
			if(stu.marks>80) {
				return "A";
			}else {
				return "B";
			}
		};
		Consumer<Student> c1 = stu -> System.out.println(stu.name + " marks: "+ stu.marks + " Grade: "+f1.apply(stu));
		
		
		for(Student s: al) {
			if(p1.test(s)) {
				c1.accept(s);
			}
		}
	}

}
