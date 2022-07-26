package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterStreamExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(25);
		list.add(5);
		list.add(30);
		list.add(15);

		System.out.println(list);

		System.out.println(list.stream().filter(i -> i % 2 == 0));
		List<Integer> evenList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(evenList);

		System.out.println(list.stream().map(i -> i * i));
		List<Integer> doubleTheList = list.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println(doubleTheList);

		List<String> strList = new ArrayList<String>();
		strList.add("naren singh");
		strList.add("singh milka");
		strList.add("mehta");
		strList.add("pappu yadav");
		strList.add("karki mukesh");
		strList.add("yoyo g");

		List<String> upperCaseNames = strList.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCaseNames);
		System.out.println("count: " + strList.stream().filter(s -> s.length() > 7).count());

//		Collections.sort(strList);
//		System.out.println(strList);

		// Default Sorting order
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);

		// Customized sorting order
		List<Integer> descOrderSortedList = list.stream().sorted((i1, i2) -> i2.compareTo(i1))
				.collect(Collectors.toList());
		System.out.println(descOrderSortedList);

		Integer min = list.stream().min((i, j) -> i.compareTo(j)).get();
		System.out.println(min);

		Integer max = list.stream().max((i, j) -> i.compareTo(j)).get();
		System.out.println(max);

		System.out.println("Iterate a list ");
		list.stream().forEach(i -> System.out.println(i));

		// With method reference
		list.stream().forEach(System.out::println);

		// convert list to arr;
		System.out.println("convert list to arr;");
		Integer[] arr = list.stream().toArray(Integer[]::new);

		for (Integer in : arr) {
			System.out.println(in);
		}

		// Stream.of method

		Stream<Integer> s = Stream.of(9, 99, 999, 9999, 99999);
//		s.forEach(System.out::println);

//		System.out.println(s.map(i -> i * 2).count());
		List<Integer> newS = s.map(i -> i * 2).collect(Collectors.toList());
		System.out.println(newS);
	}

}
