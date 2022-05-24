package functionalInterfaces.UnaryOperator;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {

		Function<Integer, Integer> f1= i -> i*i;
		System.out.println(f1.apply(10));
		
		// UnaryOperator is child interface of Function interface.
		// If both input and return argument are same type then we should go for UnaryOperator
		
		UnaryOperator<Integer> u1 = i-> i*i;
		System.out.println(u1.apply(10));
		
		
		//If inout and output arguments are int primitive type then go for IntUnaryOperator
		IntUnaryOperator u2 = i->i*i;
		System.out.println(u2.applyAsInt(10));
		
		LongUnaryOperator u3 = i->i*i;
		System.out.println(u3.applyAsLong(300000000l));
		
		DoubleUnaryOperator u4 = i->i*i;
		System.out.println(u4.applyAsDouble(3.14444444d));
		
		
	}

}
