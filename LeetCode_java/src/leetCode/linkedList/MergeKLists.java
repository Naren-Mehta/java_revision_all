package leetCode.linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeKLists {

    public static ListNode mergeKLists(ListNode[] lists) {

        if(lists == null || lists.length == 0) return null;
        if(lists.length ==1 ) return  lists[0];
        ArrayList<ListNode> al = new ArrayList<>();

        for (int i = 0; i < lists.length; i++) {
            ListNode current = lists[i];
            while (current != null) {
                al.add(current);
                current = current.next;
            }
        }

        Collections.sort(al, (a, b) -> Integer.valueOf(a.val).compareTo(Integer.valueOf(b.val)));
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        for (ListNode node : al) {
            node.next = null;
            tail.next = node;
            tail = tail.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode[] lists = new ListNode[3];

        LinkedListExample l1 = new LinkedListExample();
        l1.insert(1);
        l1.insert(4);
        l1.insert(5);


        LinkedListExample l2 = new LinkedListExample();
        l2.insert(1);
        l2.insert(3);
        l2.insert(4);

        LinkedListExample l3 = new LinkedListExample();
        l3.insert(2);
        l3.insert(6);

        lists[0] = l1.head;
        lists[1] = l2.head;
        lists[2] = l3.head;

        ListNode result = mergeKLists(lists);

        l1.print(result);
    }
}
