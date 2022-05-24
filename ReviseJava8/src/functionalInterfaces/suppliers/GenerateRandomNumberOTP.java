package functionalInterfaces.suppliers;

import java.util.function.Supplier;

public class GenerateRandomNumberOTP {

	public static void main(String[] args) {

		
		Supplier<String> s1 = ()->{
			
			String otp = "";
			for(int i=0;i<6;i++) {
				otp += (int)(Math.random()*10);
			}
			return otp;
		};
		
		System.out.println(s1.get());	
		
	}

}
