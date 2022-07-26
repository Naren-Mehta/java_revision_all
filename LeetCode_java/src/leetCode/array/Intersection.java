//https://leetcode.com/problems/intersection-of-two-arrays/

package leetCode.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class Intersection {
    public static int[] intersection1(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
                set.add(nums1[i]);
        }

        for(int i=0;i< nums2.length;i++){
            if(set.contains(nums2[i])){
                res.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }

        return res.stream().mapToInt(Number ::intValue).toArray();
    }

    public static boolean binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return true;
            }

            if(target < arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return  false;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        HashSet<Integer> set = new HashSet();

        for(Integer i: nums1){
            if(binarySearch(nums2, i)){
                set.add(i);
            }
        }

        int[] result = new int[set.size()];
        int i=0;
        for(int x: set){
            result[i++] = x;
        }

        return  result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] arr = intersection(nums1, nums2);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
