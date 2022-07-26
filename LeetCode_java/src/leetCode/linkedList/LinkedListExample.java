package leetCode.linkedList;


import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LinkedListExample {

    public ListNode head = null;

    public void insert(int val) {
        ListNode node = new ListNode(val);
        if (head == null) {
            head = node;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public void insert(ListNode node) {
        if (head == null) {
            head = node;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public int length(ListNode head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }

    public void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        int size = this.length(head);
//        int count = 0;
//        ListNode current = head;
//        ListNode prev = null;
//        while(count < size-n && current!=null){
//            prev = current;
//            current = current.next;
//            count++;
//        }
//
//        if(prev==null){
//            return  current.next;
//        }
//        prev.next = current.next;
//        return head;
//    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;

        ListNode fast = newHead;
        ListNode slow = newHead;
        while (n > 0) {
            fast = fast.next;
            n--;
        }

        System.out.println(fast.val);

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        System.out.println(fast.val+" Slow===" + slow.val);
        slow.next = slow.next.next;
        return newHead.next;
    }

//    public static  ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode newHead = new ListNode(-1);
//        ListNode current = newHead;
//        while(list1!=null && list2!=null){
//            if(list1.val <= list2.val){
//                current.next = list1;
//                list1 = list1.next;
//            }else{
//                current.next = list2;
//                list2 = list2.next;
//            }
//            current = current.next;
//        }
//
//        while(list1!=null){
//            current.next = list1;
//            list1 = list1.next;
//            current = current.next;
//        }
//
//        while(list2!=null){
//            current.next = list2;
//            list2 = list2.next;
//            current = current.next;
//        }
//        return newHead.next;
//    }

    public static  ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead = new ListNode(-1);
        ListNode current = newHead;
        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                current.next = list1;
                list1 = list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        while(list1!=null){
            current.next = list1;
            list1 = list1.next;
            current = current.next;
        }

        while(list2!=null){
            current.next = list2;
            list2 = list2.next;
            current = current.next;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        LinkedListExample ll = new LinkedListExample();
        ll.insert(1);
        ll.insert(2);
        ll.insert(4);


        LinkedListExample l2 = new LinkedListExample();
        l2.insert(1);
        l2.insert(3);
        l2.insert(4);

//        ll.removeNthFromEnd(ll.head, 2);
        ll.print(ll.head);
        l2.print(l2.head);

        ListNode merged = mergeTwoLists(ll.head, l2.head);
        System.out.println(merged.val);
        ll.print(merged);

    }
}
