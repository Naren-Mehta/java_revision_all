package leetCode.array.medium;

import java.util.*;

public class Three3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return new ArrayList<>(res);
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4};
        List<List<Integer>> list = threeSum(arr);

        for (List<Integer> l : list) {
            System.out.print("====" + l);
        }
    }
}
