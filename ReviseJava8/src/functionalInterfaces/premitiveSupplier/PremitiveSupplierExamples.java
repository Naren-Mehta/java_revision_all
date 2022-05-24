package functionalInterfaces.premitiveSupplier;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class PremitiveSupplierExamples {

	public static void main(String[] args) {
		
		Supplier<Integer> s1 = ()-> (int)(Math.random()*10);
		System.out.println(s1.get());
		
		IntSupplier s2= ()-> (int)(Math.random()*10);
		System.out.println(s2.getAsInt());
		
		
		LongSupplier s3= ()-> (long)(Math.random()*1000000);
		System.out.println(s3.getAsLong());
		
		DoubleSupplier s4= ()-> Math.random();
		System.out.println(s4.getAsDouble());
		
		BooleanSupplier s5 = () -> ((int)(Math.random()*10)) %2 ==0  ;
		System.out.println(s5.getAsBoolean());
	}

}
