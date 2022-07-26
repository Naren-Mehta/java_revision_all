//https://leetcode.com/problems/search-in-rotated-sorted-array/
package algorithms.binarySearch;

public class SearchInRotatedSortedArray {

    public static int search(int[] nums, int target) {

        int start1 = 0;
        int end1 = 0;
        int start2 = 0;
        int end2 = nums.length - 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                end1 = i - 1;
                start2 = i;
                break;
            }
        }
        int start = 0;
        int end = 0;

        if (target >= nums[start1] && target <= nums[end1]) {
            start = start1;
            end = end1;
        } else if (target >= nums[start2] && target <= nums[end2]) {
            start = start2;
            end = end2;
        } else {
            return -1;
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {

        int[] nums = {3, 1};
        int result = search(nums, 1);
        System.out.println(result);
    }
}
