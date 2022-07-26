package leetCode.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubArrays {

    ArrayList<ArrayList<Integer>> list = new ArrayList();
    public void subArrays(int[] arr, int index, ArrayList al) {
        if (index >= arr.length) {
            this.list.add(new ArrayList<>(al));
            return;
        }
        al.add(arr[index]);
        subArrays(arr, index + 1, al);
        al.remove(al.size() - 1);
        subArrays(arr, index + 1, al);
    }

    public static void main(String[] args) {
        PrintAllSubArrays obj = new PrintAllSubArrays();
        ArrayList al = new ArrayList();
        int[] arr = {3, 1, 2};
        obj.subArrays(arr, 0, al);
        System.out.println(obj.list);
    }
}
