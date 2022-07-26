//https://leetcode.com/problems/reduce-array-size-to-the-half/

package leetCode.array.medium;

import java.util.*;

public class MinSetSize {

    public static HashMap<Integer, Integer> sortHashMap(HashMap<Integer, Integer> map) {
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, (i1, i2) -> i2.getValue().compareTo((i1.getValue())));

        HashMap<Integer, Integer> newMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            newMap.put(entry.getKey(), entry.getValue());
        }
        return newMap;
    }

    public static int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int value = 1;
            if (map.get(arr[i]) != null) {
                value = map.get(arr[i]) + 1;
            }
            map.put(arr[i], value);
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, (i1, i2)-> i2.compareTo(i1));
        int sum =0;
        int count =0;
        for (Integer value : list) {
            sum += value;
            count++;
            if(sum>= arr.length/2){
                return count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3,3,3,3,5,5,5,2,2,7};
        int result = minSetSize(arr);
        System.out.println(result);
    }
}
