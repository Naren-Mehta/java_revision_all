package lambda;

import java.util.TreeSet;

public class SortAnTreeSetDescendingOrder {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>((I1, I2) -> (I1 < I2) ? 1 : (I1 > I2) ? -1 : 0);
		ts.add(5);
		ts.add(6);
		ts.add(3);
		ts.add(2);
		ts.add(1);
		ts.add(7);
		
		System.out.println(ts);
	}

}
