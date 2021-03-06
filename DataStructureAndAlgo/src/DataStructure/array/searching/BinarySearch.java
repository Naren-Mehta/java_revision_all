package DataStructure.array.searching;

public class BinarySearch {

	// Binary search only works in sorted array

	public static int search(int[] arr, int key, int start, int end) {
		int mid = (start + end) / 2;

		if (start > end) {
			return -1;
		}

		if (key < arr[mid]) {
			return search(arr, key, start, mid - 1);
		} else if (key > arr[mid]) {
			return search(arr, key, mid + 1, end);
		} else {
			return mid;
		}
	}

	public static int searchViaRecursion(int[] arr, int key, int start, int end) {
		int mid = (start + end) / 2;

		if (start > end) {
			return -1;
		}

		if (key == arr[mid]) {
			return mid;
		} else if (key > arr[mid]) {
			return search(arr, key, mid + 1, end);
		} else {
			return search(arr, key, start, mid - 1);
		}
	}

	public static int binary_search(int[] arr, int key) {

		int result = searchViaRecursion(arr, key, 0, arr.length - 1);

		return result;
	}

	public static int binary_search_via_loop(int[] arr, int key) {

		int start = 0;
		int end = arr.length - 1;
		
		while (start <= end) {
			int mid = (start + end) / 2;
			if (key == arr[mid]) {
				return mid;
			} else if (key > arr[mid]) {
				start =  mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int result = binary_search(new int[] { 1, 2, 10, 11, 19, 28, 29 }, 2);
		System.out.println(result);
		
		int result1 = binary_search_via_loop(new int[] { 1, 2, 10, 11, 19, 28, 29 }, 100);
		System.out.println(result1);
	}

}
