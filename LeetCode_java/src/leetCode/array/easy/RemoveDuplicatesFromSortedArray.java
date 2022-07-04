//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

package leetCode.array.easy;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i=0 ;i<nums.length;i++){
            if(map.get(nums[i]) != null){
                nums[i] = Integer.MAX_VALUE;
            }else{
                map.put(nums[i], true);
            }
        }
        Arrays.sort(nums);
        return map.size();
    }

    public static int removeDuplicatesCopied(int[] nums) {
        int j =0;
        for(int i=0 ;i<nums.length;i++){
            if(nums[i]!= nums[j]){
                nums[++j] = nums[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicatesCopied(nums);
        System.out.println("=========="+k);
        for(int i: nums){
            System.out.println(i);
        }
    }
}
