//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

package leetCode.array.medium;

public class SearchRange {
    public static int[] searchRange(int[] nums, int target) {

        int first = -1;
        int last = -1;

        for(int i=0; i<nums.length;i++){
            if(nums[i] == target){
                if(first == -1) first = i;
                last = i;
            }
        }

        int[] arr= new int[2];
        arr[0]=first;
        arr[1]=last;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 5;
        int[] result = searchRange(arr, target);

        for(int i: result){
            System.out.println(i);
        }
    }
}
