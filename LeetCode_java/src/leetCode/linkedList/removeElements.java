package leetCode.linkedList;

public class removeElements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            if (current.val != val) {
                prev = current;
            }else{
                if(prev!=null){
                    prev.next = current.next;
                }else {
                    head = head.next;
                }
            }
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        LinkedListExample l1 = new LinkedListExample();
        l1.insert(6);
        l1.insert(6);
        l1.insert(6);
//        l1.insert(3);
//        l1.insert(4);
//        l1.insert(5);
//        l1.insert(6);

        ListNode result = removeElements(l1.head, 6);
        l1.print(result);
    }
}
