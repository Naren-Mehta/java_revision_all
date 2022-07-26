package leetCode.array.easy;

import java.util.HashMap;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for(int i=0;i< nums.length;i++){
            if(hm.get(nums[i])!=null){
                return true;
            }else{
                hm.put(nums[i], true);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        boolean result = containsDuplicate(arr);
        System.out.println(result);
    }
}
