package defaultMethods;

interface Interf{
	public abstract void m1();
	public static final int x =10;
	
	default void m2() {
		System.out.println("m2 default method");
	}
}

public class DefaultMethodExample implements Interf{

	@Override
	public void m1() {
		System.out.println("my own implementation ");
	}
	
	// if we overrides m2 method
//	public void m2() {
//		System.out.println("My m2 method");
//	}
	
	public static void main(String[] args) {
		DefaultMethodExample obj = new DefaultMethodExample();
		
		obj.m1();
		obj.m2();
	}
	
	

}
