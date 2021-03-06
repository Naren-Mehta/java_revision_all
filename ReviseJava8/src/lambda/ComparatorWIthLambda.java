package lambda;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorWIthLambda {

	public static void main(String[] args) {

		Comparator c = (o1, o2)->{
			String s1 = o1.toString();
			String s2 = o2.toString();
			return -s1.compareTo(s2);
		};
		TreeSet ts = new TreeSet(c);
		
		ts.add("test");
		ts.add(new String("hello"));
		ts.add("abc");
		ts.add(new StringBuffer("string buffer"));
		
		System.out.println(ts);
		
	}

}
