package lambda;

@FunctionalInterface
interface MyInterface {
	public void m1();
}

@FunctionalInterface
interface ChildInterface extends MyInterface{
	public void m1();
//	public void m2(); // This will throw an compile time error coz its functionalInterface, and Functional Interface can have only one abstact method
}

interface ChildInterface2 extends MyInterface{
	public void m1();
	public void m2(); // This will work as expected coz this is normal interface (not functional interface); 
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {

		
	}

}
