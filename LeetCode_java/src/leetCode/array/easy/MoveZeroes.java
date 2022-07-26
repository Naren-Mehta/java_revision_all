//https://leetcode.com/problems/move-zeroes/

package leetCode.array.easy;

public class MoveZeroes {

    // Best Solution

    public static void moveZeroes(int[] nums) {
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count++] = temp;
            }
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
    // My Solution==================================================
    public static void moveZeroes1(int[] nums) {
        if (nums.length < 2) {
            return;
        }
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        if (j >= 0) {
            for (int i = j + 1; i < nums.length; i++) {
                if (nums[i] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j++] = temp;
                }
            }
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);

    }
}
