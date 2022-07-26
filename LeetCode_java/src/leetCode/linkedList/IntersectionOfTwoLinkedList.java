package leetCode.linkedList;

public class IntersectionOfTwoLinkedList {

    public static int length(ListNode headA) {

        int count = 0;
        while (headA != null) {
            headA = headA.next;
            count++;
        }
        return count;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int length1 = length(headA);
        int length2 = length(headB);

        while(length1 > length2){
            headA = headA.next;
            length1--;
        }

        while(length2> length1){
            headB = headB.next;
            length2--;
        }

        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }

    public static void main(String[] args) {
        LinkedListExample l1 = new LinkedListExample();
        l1.insert(8);
        l1.insert(4);
        l1.insert(5);


        LinkedListExample l2 = new LinkedListExample();
        l2.insert(4);
        l2.insert(1);
        l2.insert(l1.head);

        LinkedListExample l3 = new LinkedListExample();
        l3.insert(5);
        l3.insert(6);
        l3.insert(1);
        l3.insert(l1.head);

        l1.print(l1.head);
        l2.print(l2.head);
        l3.print(l3.head);

        ListNode result = getIntersectionNode(l2.head, l3.head);
        System.out.println("Result: "+result.val);

    }

}
