package DataStructure.array.searching;

public class LinearSearch {

	public static int linear_search(int[] arr, int key) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int result = linear_search(new int[] { 1, 2, 0, 10, 11, 9, 8, 8, 7 }, 9);
		System.out.println(result);
	}

}
