package functionalInterfaces.biPredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {

		BiPredicate<String, String> bp1= (s1, s2) -> s1.equals(s2);
		
		System.out.println(bp1.test("naren", "naren"));
		System.out.println(bp1.test("naren", "mehta"));
		
		BiPredicate<Integer, Integer> bp2 = (i1, i2) -> (i1+i2) %2 ==0;
		System.out.println(bp2.test(10, 20));
		System.out.println(bp2.test(10, 11));
		
		// and // or // nigate methods are also there
		

	}

}
