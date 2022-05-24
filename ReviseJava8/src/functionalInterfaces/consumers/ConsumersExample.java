package functionalInterfaces.consumers;

import java.util.ArrayList;
import java.util.function.Consumer;

class Movie {
	String name;
	String hero;

	Movie(String name, String hero) {
		this.name = name;
		this.hero = hero;
	}
}

public class ConsumersExample {

	public static void main(String[] args) {

		Consumer<String> c1 = s -> System.out.println(s);
		c1.accept("hello");
		
		ArrayList<Movie> al = new ArrayList<Movie>();
		al.add(new Movie("Sole", "AB & Dhrm"));
		al.add(new Movie("DDLJ", "SRK"));
		
		
		Consumer<Movie> c2 = m-> System.out.println(m.name + " " + m.hero);
		
		for(Movie m : al) {
			c2.accept(m);
		}
		

	}

}
