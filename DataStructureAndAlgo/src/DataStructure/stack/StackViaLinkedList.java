package DataStructure.stack;

class Node {
	int value;
	Node next;

	Node(int value) {
		this.value = value;
	}
}

class Stack {
	Node head;

	Stack() {
		head = null;
	}

	public void push(int value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}

	public int pop() {
		if (head == null) {
			System.out.println("Stack is empty");
			return -1;
		} else {
			int value = head.value;
			head = head.next;
			return value;
		}
	}

	public boolean isEmpty() {
		return head == null ? true : false;
	}

	public void print() {
		Node current = head;
		while (current != null) {
			System.out.print(current.value + " ");
			current = current.next;
		}
	}

}

public class StackViaLinkedList {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1);
		stack.print();
		stack.push(2);
		stack.print();

		stack.push(3);
		stack.print();
		stack.push(4);
		stack.print();
		System.out.println("==" + stack.pop());
		stack.print();

	}

}
