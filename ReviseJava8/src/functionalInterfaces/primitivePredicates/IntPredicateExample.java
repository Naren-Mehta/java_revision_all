package functionalInterfaces.primitivePredicates;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class IntPredicateExample {

	public static void main(String[] args) {

		
		// There are three Premitive Predicats available: IntPredicate, LongPredicate, DoublePredicate
		IntPredicate tp = x -> x % 2 == 0;
		LongPredicate lp = x -> x %2 ==0;
		DoublePredicate dp = x -> x %2 ==0;

		int[] arr = { 5, 10, 15, 20, 25, 30 };
		
		for(int i: arr) {
			if(tp.test(i)) {
				System.out.println("Even==="+i);
			}
		}
		
		System.out.println(lp.test(10l));
		System.out.println(dp.test(10.0));

	}

}
