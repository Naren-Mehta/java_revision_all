package functionalInterfaces.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveNullAndEmptyStringFromArr {

	public static void main(String[] args) {

		String[] arr = {"Naren", " ", null, "Ravi", " " , "Sachin", null};
		
		Predicate<String> p = s -> s != null && s.trim().length()!=0;
		
		ArrayList<String> al = new ArrayList<String>();
		for(String s: arr) {
			if(p.test(s)) {
				al.add(s);
			}
		}
		
		System.out.println(al);

		String[] arr1 = new String[al.size()];
		arr1 = al.toArray(arr1);
		
		for(String s: arr1) {
			System.out.println(s);
		}
	}

}
