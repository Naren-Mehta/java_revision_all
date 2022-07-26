package doubleColon;

public class ThreadExample {

	public void myRun() {
		for (int i = 0; i < 10; i++) {
			System.out.println("My Child Thread");
		}
	}

	public static void main(String[] args) {

		// Lambda Expression Example

//		Runnable r = ()->{
//			for(int i=0;i<10;i++) {
//				System.out.println("Child Thread");
//			}
//		};
//		
//		Thread t = new Thread(r);
//		t.start();
//		
//		
//		for(int i=0;i<10;i++) {
//			System.out.println("Main Thread");
//		}

		// =============================Method Reference Example
		// ::===============================

		ThreadExample obj = new ThreadExample();
		Runnable r = obj::myRun;
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}

}
