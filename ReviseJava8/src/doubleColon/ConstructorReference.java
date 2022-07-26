package doubleColon;


class Sample{
	
	Sample(){
		System.out.println("Sample Constructor Execution & Object creation");
	}
}

interface Interf1 {
	public Sample get();
}

public class ConstructorReference {

	public static void main(String[] args) {
		
		// With lambda expression
//		Interf1 i1= ()->{
//			Sample s = new Sample();
//			return s;
//		};
//		
//		Sample s = i1.get();
		
		// WIth Constructor Reference
		
		Interf1 i2 = Sample :: new;
		Sample s1 = i2.get();
		
		
	}

}
