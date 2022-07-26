//https://leetcode.com/problems/group-anagrams/

package leetCode.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            List<String> l;

            if (map.get(s) != null) {
                l = map.get(s);
            } else {
                l = new ArrayList<>();
            }
            l.add(str);
            map.put(s, l);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strArr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strArr);
        System.out.println(result);
    }
}
