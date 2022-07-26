//https://leetcode.com/problems/merge-intervals/
package leetCode.array.medium;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {

        if (intervals.length < 2) {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        LinkedList<int[]> merged = new LinkedList<>();


        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {5,7},{8, 10}, {15, 18}};
//        int[][] arr = {{1, 4}, {5, 6}};
//        int[][] arr = {{1, 3}};

        int[][] newArr = merge(arr);

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
