package doubleColon;


interface Interf {
	public void m1();
}
public class DoubleColonExample {

	public static void m2() {
		System.out.println("==reference to m1");
	}
	public static void main(String[] args) {
		
		Interf i= DoubleColonExample :: m2;
		
		i.m1();

	}

}
