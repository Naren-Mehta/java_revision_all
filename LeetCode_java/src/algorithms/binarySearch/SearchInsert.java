package algorithms.binarySearch;

public class SearchInsert {

    public static int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int result = searchInsert(nums, 2);
        System.out.println(result);
    }
}
