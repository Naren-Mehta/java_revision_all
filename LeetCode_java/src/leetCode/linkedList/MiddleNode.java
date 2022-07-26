package leetCode.linkedList;

public class MiddleNode {

    public static ListNode middleNode(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast!= null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;

    }

    public static void main(String[] args) {
        LinkedListExample l1 = new LinkedListExample();
        l1.insert(1);
        l1.insert(2);
        l1.insert(3);
        l1.insert(4);
        l1.insert(5);
        l1.insert(6);

        ListNode result = middleNode(l1.head);
        System.out.println(result.val);
    }
}
