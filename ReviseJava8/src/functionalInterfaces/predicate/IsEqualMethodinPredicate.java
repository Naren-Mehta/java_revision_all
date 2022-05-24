package functionalInterfaces.predicate;

import java.util.function.Predicate;

public class IsEqualMethodinPredicate {

	public static void main(String[] args) {

		Predicate<String> p = Predicate.isEqual("durgasoft");
		
		System.out.println(p.test("naren"));
		
		System.out.println(p.test("durgasoft"));
	}

}
