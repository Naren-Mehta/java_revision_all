package defaultMethods;

interface Interf1 {
	default void m1() {
		System.out.println("Interf1 m1 method");
	}
}

interface Interf2 {
	default void m1() {
		System.out.println("Interf2 m1 method");
	}
}

public class AmbiguityIssueWithDefaultMethodExample implements Interf1, Interf2 {

	@Override
	public void m1() {
		Interf1.super.m1();
		Interf2.super.m1();
	}

	public static void main(String[] args) {
		AmbiguityIssueWithDefaultMethodExample obj = new AmbiguityIssueWithDefaultMethodExample();
		obj.m1();
	}

}
