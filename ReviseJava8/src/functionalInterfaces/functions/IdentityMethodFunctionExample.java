package functionalInterfaces.functions;

import java.util.function.Function;

public class IdentityMethodFunctionExample {

	public static void main(String[] args) {

		Function<String, String> f1= Function.identity();
		
		String s2= f1.apply("Naren");
		
		System.out.println(s2);
		System.out.println(s2.equals("Naren"));

		
	}

}
