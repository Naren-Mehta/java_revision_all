package functionalInterfaces.primitiveFunctions;

import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class PremitiveFunctionExample {

	public static void main(String[] args) {

		// IntFunction means input type is Integer
		IntFunction<Integer> if1 = i -> i * i;
		System.out.println(if1.apply(10));

		LongFunction<Long> lf1 = i -> i * i;
		System.out.println(lf1.apply(10l));

		DoubleFunction<Double> df1 = i -> i * i;
		System.out.println(df1.apply(10.02d));

//		================================================================================================

		// ToIntFunction means it will always return int value (input type can be
		// anything)
		ToIntFunction<String> tIF = s -> s.length();
		System.out.println(tIF.applyAsInt("test"));

		ToLongFunction<String> tlF = s -> s.length();
		System.out.println(tlF.applyAsLong("test"));

		ToDoubleFunction<String> tDF = s -> s.length();
		System.out.println(tDF.applyAsDouble("test1"));

//		================================================================================================

		// Input is int, return is Double
		IntToDoubleFunction iDf = i -> Math.sqrt(i);
		System.out.println(iDf.applyAsDouble(10));
		
		
		// Input is int, return is Double
		IntToLongFunction iTL = i -> i * 405555555555555555l;
		System.out.println(iTL.applyAsLong(10));
		
		
		// Input is long, return is Double
		LongToDoubleFunction lTD = i -> Math.pow(i, 5);
		System.out.println(lTD.applyAsDouble(10l));
		
		LongToIntFunction lTI = i -> (int)i%2;
		System.out.println(lTI.applyAsInt(11l));

	}

}
