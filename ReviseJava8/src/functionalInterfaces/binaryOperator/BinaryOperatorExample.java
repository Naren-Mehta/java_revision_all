package functionalInterfaces.binaryOperator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorExample {

	public static void main(String[] args) {

		
		Function<Integer, Integer> f1 = i-> i*i;
		
		BiFunction<Integer, Integer, Integer> f2 = (i, j)-> i+j;
		System.out.println(f2.apply(10, 2));
		
		// If all Input and return arguments are same then we should go for BinaryOprator
		
		
		BinaryOperator<Integer> b1 = (i, j)-> i+j;
		System.out.println(b1.apply(1000, 500));
		
		
		IntBinaryOperator b2 = (i,j) -> i+j;
		System.out.println(b2.applyAsInt(1000, 10));
		
		LongBinaryOperator b3 = (i,j) -> i*j;
		System.out.println(b3.applyAsLong(100000, 11122000));
		
		DoubleBinaryOperator b4 = (i, j) -> i*j;
		System.out.println(b4.applyAsDouble(3.445, 5.77788888888));
		
		
	}

}
