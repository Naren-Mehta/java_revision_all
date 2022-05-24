package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortAndArrayList {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("rahul");
		al.add("bahadur");
		al.add("naren");
		al.add("mehta");
		al.add("amit");
		Collections.sort(al, (s1, s2) -> s2.compareTo(s1));
		System.out.println(al);
	}

}
