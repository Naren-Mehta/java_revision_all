package leetCode.array.medium;

import java.util.*;

public class SortHashMapByValue {

    public static HashMap<Integer, Integer> sortHashMap(HashMap<Integer, Integer> map) {
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, (i1, i2) -> i1.getValue().compareTo((i2.getValue())));

        HashMap<Integer, Integer> newMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            newMap.put(entry.getKey(), entry.getValue());
        }

        return newMap;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = {3, 3, 3, 3, 5, 5, 5, 2, 2, 7};

        for (int i = 0; i < arr.length; i++) {
            int value = 1;
            if (map.get(arr[i]) != null) {
                value = map.get(arr[i]) + 1;
            }
            map.put(arr[i], value);
        }

        System.out.println(map);

        System.out.println("======================================");
        HashMap<Integer, Integer> sortedMap = sortHashMap(map);

        System.out.println(sortedMap);
    }
}
