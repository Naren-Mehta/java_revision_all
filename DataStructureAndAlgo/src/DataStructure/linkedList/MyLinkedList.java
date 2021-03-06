package DataStructure.linkedList;

import java.util.Stack;

public class MyLinkedList {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	public static MyLinkedList insert(MyLinkedList list, int data) {
		Node node = new Node(data, null);

		if (list.head == null) {
			list.head = node;
		}

		else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = node;
		}

		return list;
	}

	public static MyLinkedList insertAtFirst(MyLinkedList list, int data) {
		Node node = new Node(data, null);

		if (list.head == null) {
			list.head = node;
		}

		else {
			node.next = list.head;
			list.head = node;
		}

		return list;
	}

	public static MyLinkedList insertAtPosition(MyLinkedList list, int data, int position) {
		Node node = new Node(data, null);

		if (list.head == null) {
			list.head = node;
		}

		else {
			Node last = list.head;
			int count = 0;
			while (last.next != null) {

				if (count == position - 1) {
					Node temp = last.next;
					last.next = node;
					node.next = temp;
					break;
				}
				last = last.next;
				count++;
			}
			last.next = node;
		}

		return list;
	}

	public static MyLinkedList remove(MyLinkedList list) {
		Node head = list.head;

		if (head == null || head.next == null) {
			list.head = null;
			return list;
		}
		while (head.next.next != null) {
			head = head.next;
		}

		head.next = null;

		return list;
	}

	public static MyLinkedList removeByPosition(MyLinkedList list, int position) {
		Node head = list.head, prev = null;

		if (position == 0 && head != null) {
			list.head = head.next;
			return list;
		}

		int count = 0;
		while (head != null) {
			if (count == position) {
				prev.next = head.next;
			}

			prev = head;
			head = head.next;
			count++;
		}

		return list;
	}

	public static MyLinkedList removeByKey(MyLinkedList list, int key) {
		Node head = list.head, prev = null;
		while (head != null) {
			if (head.data == key) {
				prev.next = head.next;
			}

			prev = head;
			head = head.next;
		}

		return list;
	}

	public static int getNodeByPosition(MyLinkedList list, int position) {
		Node head = list.head;
		int count = 0;

		while (head != null) {
			if (count == position - 1) {
				return head.data;
			}

			head = head.next;
			count++;
		}

		return 0;
	}

	public static void print(MyLinkedList list) {
		Node head = list.head;
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	public static int size(MyLinkedList list) {
		Node head = list.head;
		int count = 0;
		while (head != null) {
			head = head.next;
			count++;
		}

		return count;
	}
	
	public static MyLinkedList reverse(MyLinkedList list) {
		Node current= list.head;
		Node next = null;
		Node previous = null;
		while(current!=null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current= next;
		}
		
		list.head =previous;
		return list;
	}
	

	public static void reveseViaStack(MyLinkedList list) {
		Node head = list.head;
		Stack<Node> stack = new Stack<Node>();

		while (head != null) {
			stack.push(head);
			head = head.next;
		}

		Node newHead = stack.pop();
		Node current = null;
		
		Node prev = newHead;
		while (!stack.isEmpty()) {
			current = stack.pop();
			current.next = null;
			prev.next = current;
			prev = current;
		}
		list.head = newHead;

		System.out.println("==" + list.head.next.data);
	}

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		list = insert(list, 20);
		list = insert(list, 25);
		list = insert(list, 35);
		list = insert(list, 40);
//		list = insert(list, 45);
//		list = insertAtFirst(list, 10);
//		list = insertAtFirst(list, 5);

//		list = insertAtPosition(list, 15, 2);
//		list = insertAtPosition(list, 17, 3);
//		list = insert(list, 50);
//
//		list = remove(list);
//		list = remove(list);
//		list = removeByPosition(list, 3);
//		list = removeByPosition(list, 3);
//		list = removeByKey(list, 35);
		print(list);
//		System.out.println("==size==" + size(list));

		reveseViaStack(list);

		print(list);
		System.out.println("==reverse list===");
		list = reverse(list);
		print(list);

	}

}
