//https://leetcode.com/problems/valid-parentheses/

package leetCode.array.easy;
import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || ch != stack.pop()) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}}"));
    }
}
