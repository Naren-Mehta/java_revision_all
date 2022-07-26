package DataStructure.array;

public class ArrayPassByReference {

	public static void test(int [] newArr) {
		System.out.println("Inside test method===============1");
		for(int i: newArr) {
			System.out.println(i);
		}
		newArr[2]=200;
		System.out.println("Inside test method========after modification=======1");

		for(int i: newArr) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		
		for(int i: arr) {
			System.out.println(i);
		}
		
		test(arr);
		
		System.out.println("=======after===========");
		for(int i: arr) {
			System.out.println(i);
		}
		
		
	}

}
