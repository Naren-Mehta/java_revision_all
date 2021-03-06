package DataStructure.array;

public class MergeTwoSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		
		int i=m-1;
		int j = n-1;
		int k = m+n-1;
		
		while(i>=0 && j>=0) {
			if(nums1[i]> nums2[j]) {
				nums1[k--] = nums1[i--];
			}else {
				nums1[k--] = nums2[j--];
			}
		}
		
		while(j>=0) {
			nums1[k--] = nums2[j--];
		}
		
		for(int x : nums1) {
			System.out.print(x + " ");
		}
	}
	public static void main(String[] args) {

		int[] arr1 = new int[]{1,2,3,0,0,0};
		int[] arr2 = new int[]{2,5,6};

		MergeTwoSortedArray obj = new MergeTwoSortedArray();
		obj.merge(arr1, 3, arr2, 3);
		
	}

}
