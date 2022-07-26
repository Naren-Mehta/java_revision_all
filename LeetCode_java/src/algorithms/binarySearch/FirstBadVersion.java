//https://leetcode.com/problems/first-bad-version

package algorithms.binarySearch;

public class FirstBadVersion {

    public static boolean isBadVersion(int num) {
        if (num == 1) {
            return true;
        }
        return false;
    }

    public static int firstBadVersion(int n) {

        int start = 1, end = n;
        while (start < end) {
            int mid = (start + end) / 2;
            if (!isBadVersion(mid)) start = mid + 1;
            else end = mid;
        }
        return start;
    }

    public static void main(String[] args) {
        int result = firstBadVersion(3);
        System.out.println(result);
    }
}
