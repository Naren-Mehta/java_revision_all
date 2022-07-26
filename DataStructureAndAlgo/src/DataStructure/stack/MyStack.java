package DataStructure.stack;

public class MyStack {

	int[] arr;
	int top = -1;

	public MyStack() {
		arr = new int[5];
	}

	public MyStack(int size) {
		arr = new int[size];
	}

	public void increaseArraySize() {
		int[] newArr = new int[arr.length * 2];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		arr = newArr;
	}

	public void push(int ele) {
		if (top == arr.length - 1) {
			increaseArraySize();
		}
		arr[++top] = ele;
	}

	public int pop() {
		if (top == -1) {
			return -1;
		}
		return arr[top--];
	}

	public boolean isEmpty() {
		return top > -1 ? false : true;
	}

	public void print() {
		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(1);
		stack.print();
		stack.push(2);
		stack.print();
		stack.push(3);
		stack.print();
		stack.push(4);
		stack.print();
		stack.push(5);
		stack.print();
		stack.push(6);
		stack.print();
		stack.push(7);
		stack.print();

		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());

	}

}
