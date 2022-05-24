package functionalInterfaces.consumers;

import java.util.function.Consumer;

class MyMovie{
	String name;
	String result;
	
	MyMovie(String name, String result){
		this.name = name;
		this.result = result;
	}
}

public class ConsumerChainExample {

	public static void main(String[] args) {
		Consumer<MyMovie> c1 = m -> System.out.println(m.name + " is relesing today");
		Consumer<MyMovie> c2 = m -> System.out.println(m.name + " screening now");
		Consumer<MyMovie> c3 = m -> System.out.println(m.name + " movie is " + m.result);

		Consumer<MyMovie> c4 = c1.andThen(c2).andThen(c3);
		
		c4.accept(new MyMovie("sholey", "hit"));
		c4.accept(new MyMovie("ABCD", "average"));

	}

}
