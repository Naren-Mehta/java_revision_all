package leetCode.array.medium;

import java.util.PriorityQueue;

public class FindKthLargestCopied {

    public static int findKthLargest(int[] nums, int k) {
        return findKthLargest(nums, 0, nums.length - 1, k);
    }

    private static int findKthLargest(int[] nums, int l, int r, int k) {
        if (l == r)
            return nums[l];

        int i = l - 1, j = r + 1, x = nums[l + (r - l) / 2];
        while (i < j) {
            do i++; while (nums[i] > x);
            do j--; while (nums[j] < x);
            if (i < j) swap(nums, i, j);
        }

        int tk = j - l + 1;
        if (tk >= k) {
            return findKthLargest(nums, l, j, k);
        } else {
            return findKthLargest(nums, j + 1, r, k - tk);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int result = findKthLargest(nums, 2);
        System.out.println(result);
    }
}
