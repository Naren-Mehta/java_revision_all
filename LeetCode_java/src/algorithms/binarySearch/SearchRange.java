//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
package algorithms.binarySearch;

public class SearchRange {
    public static int search(int[] nums, int target, boolean leftSide) {
        int res = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                res = mid;

                if (leftSide) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return res;
    }

    public static int[] searchRange(int[] nums, int target) {

        int left = search(nums, target, true);
        int right = search(nums, target, false);
        int[] result = new int[2];
        result[0] = left;
        result[1] = right;
        return result;
    }

    public static void main(String[] args) {
        int[] num = {5, 7, 7, 8, 8};

        int[] result = searchRange(num, 8);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
