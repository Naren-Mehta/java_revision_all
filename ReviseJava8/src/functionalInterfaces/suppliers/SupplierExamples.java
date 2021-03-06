package functionalInterfaces.suppliers;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierExamples {

	public static void main(String[] args) {

		Supplier<Date> s = () -> new Date();
		
		System.out.println(s.get());
		
		System.out.println(s.get());
		
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);
				System.out.println(s.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		String[] nameList = {"sachin", "ramesh", "suresh", "mahesh", "naresh"};
		
		Supplier<String> s1 = ()->{
			int random = (int)(Math.random()*4);
			return nameList[random];
		};
		
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());

		
	}

}
