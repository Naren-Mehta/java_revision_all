package functionalInterfaces.functions;

import java.util.function.Function;

public class FunctionClassExample {

	public static void main(String[] args) {

		
		//find the length of a string
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("test"));
		
		
		//return squre of a number
		
		Function<Integer, Integer> f2  = x -> x*x;
		System.out.println(f2.apply(10));
		
		//Replace all spaces
		
		Function<String , String> f3 = s -> s.replaceAll(" ", "");
		System.out.println(f3.apply("this is narendra . test this "));
		
		
		// Return difference btw string with space vs string without string
		Function<String , Integer> f4 = s -> s.length() - s.replaceAll(" ", "").length();
		System.out.println(f4.apply("this is narendra . test this "));
		
	}

}
