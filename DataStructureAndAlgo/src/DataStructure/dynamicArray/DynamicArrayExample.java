package DataStructure.dynamicArray;

public class DynamicArrayExample {

	public static int capacity = 5;
	public static int count = 0;
	public static int[] resizeArray(int[] arr) {
		capacity *= 2;
		System.out.println("Updating array======================>" + capacity);

		int[] newArr = new int[capacity];

		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}

	public static int[] insert(int[] arr) {
		for (int i = 0; i < 100; i++) {
			if (count == capacity) {
				arr = resizeArray(arr);
			}
			arr[count++] = i;
			
		}
		return arr;
	}

	public static void printArray(int[] arr) {
		for(int i: arr) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[capacity];

		arr = insert(arr);
		printArray(arr);
	}

}
