package lambda;

@FunctionalInterface
interface Interf {
	public void test();
	
//	public abstract void test1();
}

public class LambdaExpressionExample { 

	
	public static void main(String[] args) {
		
		Runnable r = ()->{
			System.out.println("===run method====");
		};
		
		Thread t1 = new Thread(r);
		t1.start();
		
		Interf i = ()->System.out.println("===test method==");
		
		i.test();
	}

}
