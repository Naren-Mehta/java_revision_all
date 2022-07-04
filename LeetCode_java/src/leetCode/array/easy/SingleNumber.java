package leetCode.array.easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int singleNumber(int[] nums) {

//        //Batter Solution============================================================================================================
//
//        int result =0;
//
//        for(int i: nums){
//            result ^= i;
//        }
//        return result;

//        MY SOLUTION====================================================================================================================
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])!=null){
                hm.put(nums[i], hm.get(nums[i])+1);
            }else{
                hm.put(nums[i], 1);
            }
        }

        int key = 0;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            if(entry.getValue() == 1){
                key= entry.getKey();
            }
        }

        return key;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int result = singleNumber(nums);
        System.out.println(result);
    }
}
