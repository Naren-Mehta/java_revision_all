package algorithms.binarySearch;

public class BinarySearch {

    public static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;

        while(start<= end){
            int mid = (start+end) /2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]< target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {5};
       int result =  search(nums, 5);
        System.out.println(result);
    }
}
