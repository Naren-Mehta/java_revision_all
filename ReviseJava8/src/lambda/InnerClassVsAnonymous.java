package lambda;

public class InnerClassVsAnonymous {

	public static void main(String[] args) {

		
		//Anonymous Class example with Thread
//		Runnable r = new Runnable() {
//			public void run() {
//				for(int i=0; i< 10; i++) {
//					System.out.println("Child Thread");
//				}
//			}
//		};
//		
//		Thread t1 = new Thread(r);
//		t1.start();
//		
//		for(int i=0; i< 10; i++) {
//			System.out.println("Main Thread");
//		}
		
		
		// WIth Lambda expression
		
//		Runnable r = ()->{
//			for(int i=0; i< 10; i++) {
//				System.out.println("Child Thread");
//			}
//		};
//		
//		Thread t1 = new Thread(r);
//		t1.start();
//		
//		for(int i=0; i< 10; i++) {
//			System.out.println("Main Thread");
//		}
		
		
		// WIth Lambda expression
		
		Thread t1 = new Thread(()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
			}
		});
		
		t1.start();
		
		for(int i=0; i< 10; i++) {
			System.out.println("Main Thread");
		}
		
	}

}
