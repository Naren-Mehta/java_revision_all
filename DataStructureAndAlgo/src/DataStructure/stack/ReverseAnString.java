package DataStructure.stack;

import java.util.Stack;

public class ReverseAnString {

	public static void main(String[] args) {

		String str = "narendra";
		Stack<Character> stack = new Stack();
		for (char c : str.toCharArray()) {
			stack.push(c);
		}
		String str1 = "";
		while (!stack.isEmpty()) {
			str1 += stack.pop();
		}

		System.out.println(str1);
	}

}
