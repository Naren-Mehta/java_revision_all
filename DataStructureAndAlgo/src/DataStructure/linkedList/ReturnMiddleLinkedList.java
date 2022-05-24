package DataStructure.linkedList;

public class ReturnMiddleLinkedList {

	
//	public static int middleNode (MyLinkedList list) {
//		
//	}
	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();
		
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);
		list.insert(list, 5);
		list.insert(list, 6);

		list.print(list);
		
		System.out.println(list.size(list));
		
		int size = list.size(list);
		
		int position = size % 2 ==0 ? (size/2) +1 : (size+1)/2;
//		System.out.println("==="+position);
		
		System.out.println("==="+list.getNodeByPosition(list, position));
	}

}
