package lambda;

interface InterfTest {
	public void m1();
}

public class ThisKeyWordWithLambda {

	int x = 888;

	// Use Anonymous class
	public void m2() {
		InterfTest i = new InterfTest() {
			int x = 200;

			public void m1() {
				System.out.println(this.x);
			}
		};

		i.m1();
	}

	// Implement Interface with lambda expression
	public void m3() {
		int y =1000;
		InterfTest i1 = () -> {
			int x = 500;
			System.out.println(this.x);
			System.out.println(x + " " +y);

		};
		
		i1.m1();
	}

	public static void main(String[] args) {
		ThisKeyWordWithLambda obj = new ThisKeyWordWithLambda();
		
		//call method with anonymous implementation
		obj.m2(); // it will print 200
		
		obj.m3(); // it will print 888
	}

}
