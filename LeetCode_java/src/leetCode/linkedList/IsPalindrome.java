//https://leetcode.com/problems/palindrome-linked-list/

package leetCode.linkedList;

import java.util.Stack;

public class IsPalindrome {

    public static boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode current = head;
        while(current!=null){
            stack.push(current.val);
            current = current.next;
        }
        while(head!=null){
            if(stack.pop() != head.val){
                return  false;
            }
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedListExample ll = new LinkedListExample();
        ll.insert(1);
        ll.insert(2);
        ll.insert(2);
//        ll.insert(1);

        boolean result = isPalindrome(ll.head);
        System.out.println(result);

    }
}
