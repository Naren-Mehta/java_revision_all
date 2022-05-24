package functionalInterfaces.biFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample {

	public static void main(String[] args) {

		
		Function<String, Integer> f1 = s1 -> s1.length();
		System.out.println(f1.apply("narendra"));
		
		
		BiFunction<String, String, Integer> bf1 = (s1, s2)-> s1.length() + s2.length();
		System.out.println(bf1.apply("narendra", "mehta"));
		
		BiFunction<Integer, Integer, Integer> bf2 = (i1, i2) -> i1*i2;
		System.out.println(bf2.apply(10, 20));
	}

}
