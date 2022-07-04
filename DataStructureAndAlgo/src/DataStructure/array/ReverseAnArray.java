package DataStructure.array;

public class ReverseAnArray {

	public static int[] reverse(int[] arr) {

		int[] newArr = new int[arr.length];
		int len = arr.length;
		for (int i = 0; i < len/2; i++) {
			newArr[i] = arr[len - 1 - i];
		}
		return newArr;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		arr=reverse(arr);
		
		for(int i: arr) {
			System.out.println(i);
		}
	}

}
