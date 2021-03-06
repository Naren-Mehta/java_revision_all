package defaultMethods;

interface InterfNew {
	public static void m1() {
		System.out.println("Interface static method");
	}
}

public class StaticMethodInInterfaceExample implements InterfNew {

	
	//this is not overriding
	public static void m1() {
		System.out.println("My m1 method");
	}
	public static void main(String[] args) {

		InterfNew.m1();

		StaticMethodInInterfaceExample obj = new StaticMethodInInterfaceExample();
//		obj.m1(); // we can't call interface static method via child class (m1 will not available in StaticMethodInInterfaceExample class);
//		StaticMethodInInterfaceExample.m1()// we can't call interface static method via child class (m1 will not available in StaticMethodInInterfaceExample class);

		obj.m1();
		
	}

}
