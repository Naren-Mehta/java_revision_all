package functionalInterfaces.predicate;

import java.util.function.Predicate;

public class PredicateJoiningMethodExamples {

	public static void m1(Predicate<Integer> p, int[] x) {

		for (int i = 0; i < x.length; i++) {
			if (p.test(x[i])) {
				System.out.println(x[i]);
			}
		}

	}

	public static void main(String[] args) {
		int[] x = { 0, 5, 10, 15, 20, 25, 30 };

		Predicate<Integer> p1 = i -> i > 10;
		Predicate<Integer> p2 = i -> i % 2 == 0;

		System.out.println("Numbers greater than 10 are: ");
		m1(p1, x);

		System.out.println("====================================");
		System.out.println("Even numbers are: ");
		m1(p2, x);

		System.out.println("====================================");
		System.out.println("Numbers not greater than 10 are: ");
		m1(p1.negate(), x);

		System.out.println("====================================");
		System.out.println("Odd numbers are: ");
		m1(p2.negate(), x);

		System.out.println("====================================");
		System.out.println("Number grater than 10 and even ");
		m1(p1.and(p2), x);

		System.out.println("====================================");
		System.out.println("Number grater than 10 or even ");
		m1(p1.or(p2), x);

	}

}
