package functionalInterfaces.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

//Predicate returns boolean value after checking some condition
//Its in java.util.Function package
// It contains only one method test()


public class PredicateExample {

	public static void main(String[] args) {

		
		Predicate<Integer> p = x -> x>10;
		System.out.println(p.test(20));
		System.out.println(p.test(5));

		Predicate<String> p1 = s -> s.length() > 5;
		System.out.println(p1.test("testing"));
		System.out.println(p1.test("test"));

		Predicate<Collection> p2 = x -> x.isEmpty();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		System.out.println(p2.test(al));

		HashSet<Integer> hs = new HashSet<Integer>();
		System.out.println(p2.test(hs));

		System.out.println("=============Predicate joining: negate(), and() , or()=====================");

	}

}
