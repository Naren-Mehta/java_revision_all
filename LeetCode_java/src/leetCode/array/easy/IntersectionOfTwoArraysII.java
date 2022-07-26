package leetCode.array.easy;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArraysII {
    public static int[] intersect(int[] nums1, int[] nums2) {

//        if (nums1.length > nums2.length) {
//            int[] temp = nums1;
//            nums1 = nums2;
//            nums2 = temp;
//        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.get(nums1[i]) != null) {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            }else{
                map.put(nums1[i], 1);
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (map.get(nums2[i]) != null && map.get(nums2[i]) >0) {
                al.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }

        return al.stream().mapToInt(i-> i).toArray();
    }

    public static void main(String[] args) {
        int[] num1 = {4, 9, 5};

        int[] num2 = {9, 4, 9, 8, 4};

        int[] result = intersect(num1, num2);

        for (int i : result) {
            System.out.println("===" + i);
        }
    }
}
