package leetCode.array.easy;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == val){
                nums[i] = Integer.MAX_VALUE;
                count++;
            }
        }
        Arrays.sort(nums);
        return  nums.length - count;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int result = removeElement(nums, 2);
        System.out.println("==="+result);
    }
}
