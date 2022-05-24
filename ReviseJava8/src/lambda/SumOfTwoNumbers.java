package lambda;

@FunctionalInterface
interface Calculator {
	public int sum(int x, int y);
}

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		
		Calculator c = (x, y) -> x+y;
		
		System.out.println(c.sum(10, 20));
		System.out.println(c.sum(100, 200));

	}

}
