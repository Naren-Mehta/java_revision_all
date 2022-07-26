//https://leetcode.com/problems/roman-to-integer/

package leetCode.array.easy;

import java.util.HashMap;

public class RomanToInteger {

    public static int romanToInt(String s) {

        HashMap<Character, Integer> mapper = new HashMap<>();
        mapper.put('I', 1);
        mapper.put('V', 5);
        mapper.put('X', 10);
        mapper.put('L', 50);
        mapper.put('C', 100);
        mapper.put('D', 500);
        mapper.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int sign = 1;
            if (i + 1 < s.length()) {
                if (mapper.get(s.charAt(i)) < mapper.get(s.charAt(i+1))) {
                    sign = -1;
                }
            }
            sum += sign * mapper.get(s.charAt(i));
        }
        return  sum;
    }

    public static void main(String[] args) {
        int value = romanToInt("MCMXCIV");
        System.out.println(value);
    }
}
