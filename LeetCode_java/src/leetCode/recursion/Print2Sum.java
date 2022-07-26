package leetCode.recursion;

import java.util.ArrayList;

public class Print2Sum {

    public static void printSum(int[] arr, ArrayList al, int index, int sum, int result) {

        if (index >= arr.length) {
            if (result == sum) {
                System.out.println(al);
            }
            return;
        }

        al.add(arr[index]);
        result += arr[index];
        printSum(arr, al, index + 1, sum, result);
        al.remove(al.size() - 1);
        result -= arr[index];
        printSum(arr, al, index + 1, sum, result);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        ArrayList<Integer> al = new ArrayList<>();
        printSum(arr, al, 0, 2, 0);
    }
}
