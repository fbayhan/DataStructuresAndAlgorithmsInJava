package LinkedListJava;

public class LinkedList2 {

	Node head;

	static class Node {

		int data;
		Node next;

		// Constructor
		Node(int d) {
			data = d;
			next = null;
		}
	}

	// Method to insert a new node
	public static LinkedList2 insert(LinkedList2 list, int data) {
		Node new_node = new Node(data);
		new_node.next = null;

		if (list.head == null) {
			list.head = new_node;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}

		return list;
	}

	// Method to print the LinkedList.
	public static void printList(LinkedList2 list) {
		Node currNode = list.head;

		System.out.print("LinkedList: ");

		while (currNode != null) {
			System.out.print(currNode.data + " ");

			currNode = currNode.next;
		}
	}

 
	public static void main(String[] args) {
 		LinkedList2 list = new LinkedList2();
 
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 7);
		list = insert(list, 8);

 		printList(list);
	}
}
