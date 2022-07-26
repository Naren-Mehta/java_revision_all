package leetCode.array.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class FindKthLargest {

    public static int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);
        return nums[nums.length-k];

    }

    public static int findKthSmallest(int[] nums, int k) {

        Arrays.sort(nums);
        return nums[k-1];

    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int result = findKthLargest(nums, 2);
        System.out.println(result);

        int res = findKthSmallest(nums, 2);
        System.out.println(res);
    }
}
