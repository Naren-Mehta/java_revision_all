//https://leetcode.com/problems/merge-two-sorted-lists/
package leetCode.linkedList;

public class MergeTwoLists {
    public static  ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1.val> list2.val){
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }

        ListNode res = list1;

        while(list1!=null && list2!=null){
            ListNode prev = null;
            System.out.println(list1.val + " ====== "+ list2.val);
            while (list1 != null && list1.val <= list2.val){
                System.out.println(list1.val + " ===inner=== "+ list2.val);
                prev = list1;
                list1 = list1.next;
            }

            prev.next = list2;

            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        return  res;
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
