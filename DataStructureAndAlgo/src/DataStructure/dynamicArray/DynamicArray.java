package DataStructure.dynamicArray;

public class DynamicArray {

	int length;
	int[] arr = {};
	int count;

	public DynamicArray() {
		this(10);
	}

	public DynamicArray(int capacity) {
		this.arr = new int[capacity];
		count = 0;
		length = capacity;
	}

	public void resize() {
		length *= 2;
		int[] newArr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}

		arr = newArr;
	}

	public void add(int num) {

		if (count == length) {
			resize();
		}
		arr[count++] = num;
	}
	
	public void addAt(int num, int index) {

		if (count == length) {
			resize();
		}
		
		for(int i = length-1 ; i> index;i--) {
			arr[i] = arr[i-1];
		}
		arr[index] = num;
	}
	
	public void remove() {
		if(count > 0) {
			arr[count-1]  = 0;
			count--;
		}
	}

	public void srink() {
		if (count == 0) {
			return;
		}
		
		System.out.println("count: "+count);
		System.out.println("length: "+length);

		int[] newArr = new int[count];
		for (int i = 0; i < count; i++) {
			System.out.println(i+ " length: "+arr[i]);

			newArr[i] = arr[i];
		}
		length = count+1;
		arr = newArr;
	}

	public void print() {
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		DynamicArray arr = new DynamicArray(5);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);

//		arr.print();
		arr.add(6);
		arr.add(7);
		arr.add(8);
		arr.add(9);
		arr.add(10);
		arr.addAt(18, 4);
		arr.srink();
		
//		arr.remove();
		
//		arr.print();

	}

}
