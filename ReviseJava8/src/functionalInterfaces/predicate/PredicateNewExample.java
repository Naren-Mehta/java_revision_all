package functionalInterfaces.predicate;

import java.util.function.Predicate;

public class PredicateNewExample {

	
	public static void m1(Predicate<String> p, String[] strArr) {
		for(String s : strArr) {
			if(p.test(s)) {
				System.out.println(s);
			}
		}
	}
	
	public static void main(String[] args) {

		String[] arr= {"Sunny", "Kajal", "Mallika", "Kartik", "Karima"};
		Predicate<String> p1 = s-> s.startsWith("K");
		
		System.out.println("Names starts with 'K': ");
		m1(p1, arr);
	}

}
