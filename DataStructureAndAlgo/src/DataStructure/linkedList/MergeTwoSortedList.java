package DataStructure.linkedList;

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

public class MergeTwoSortedList {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;
	
		if (list1.val > list2.val) {
			ListNode temp = list1;
			list1 = list2;
			list2 = temp;
		}

		ListNode res = list1;

		while (list1 != null && list2 != null) {
			ListNode prev = null;
			while (list1 != null && list1.val <= list2.val) {
				prev = list1;
				list1 = list1.next;
			}
			prev.next = list2;

			ListNode temp = list1;
			list1 = list2;
			list2 = temp;
		}

		return res;

	}

	public static void main(String[] args) {
		MergeTwoSortedList obj = new MergeTwoSortedList();
		ListNode list1 = new ListNode(2);
		ListNode list2 = new ListNode(1);

		ListNode mergedList = obj.mergeTwoLists(list1, list2);
		print(mergedList);

	}

	public static void print(ListNode list) {
		while (list != null) {
			System.out.print(list.val+" ");
			list = list.next;
		}
	}

}
