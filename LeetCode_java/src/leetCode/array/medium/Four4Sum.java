package leetCode.array.medium;

import java.util.*;

public class Four4Sum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int k = j + 1;
                int l = nums.length - 1;
                while (k < l) {
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[k] + (long)nums[l];
                    if (sum == target) {
                        System.out.println("==========================="+sum);
                        set.add(Arrays.asList(nums[i], nums[j], nums[k++], nums[l--]));
                    } else if (sum > target) {
                        l--;
                    } else {
                        k++;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] arr = {1000000000,1000000000,1000000000,1000000000};
//        List<List<Integer>> list = fourSum(arr, -294967296);
//        for(List<Integer> l: list){
//            System.out.println(l);
//        }
        long sum = 0;
        for(int i: arr){
            sum+= i;
        }
        System.out.println(sum);
    }
}
