package leetCode.linkedList;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {

        if(head==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            if (fast == slow) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }

        return false;
    }

    public static void main(String[] args) {
        LinkedListExample ll = new LinkedListExample();
        ll.insert(1);
        ll.insert(2);

        boolean result = hasCycle(ll.head);
        System.out.println(result);
    }
}
