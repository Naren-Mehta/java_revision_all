package lambda;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortATreeMapDescendingOrder {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>((obj1, obj2) -> (obj1 < obj2) ? 1 : (obj1> obj2) ?-1:0);
		
		tm.put(1, "naren");
		tm.put(6,  "test");
		tm.put(3, "nirvi");
		tm.put(8, "bahadur");
		
		System.out.println(tm);
		
//		System.out.println(tm.entrySet().getClass().getName());
//		Set<Map.Entry<Integer, String>> entries = tm.entrySet();
//		for(Map.Entry<Integer, String> entry : entries) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
		
//		for(Map.Entry<Integer, String> entry : tm.entrySet()) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
		
	}

}
