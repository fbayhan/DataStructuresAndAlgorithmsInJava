package LinkedListJava;

import java.io.*;

public class LinkedList4 {

	Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static LinkedList4 insert(LinkedList4 list, int data) {

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

	public static void printList(LinkedList4 list) {
		Node currNode = list.head;

		System.out.print("LinkedList: ");

		while (currNode != null) {

			System.out.print(currNode.data + " ");

			currNode = currNode.next;
		}

		System.out.println();
	}

	public static LinkedList4 deleteAtPosition(LinkedList4 list, int index) {

		Node currNode = list.head, prev = null;

		if (index == 0 && currNode != null) {
			list.head = currNode.next;
			System.out.println(index + " position element deleted");
			return list;
		}

		int counter = 0;
		while (currNode != null) {

			if (counter == index) {
				prev.next = currNode.next;
				System.out.println(index + " position element deleted");
				break;
			} else {

				prev = currNode;
				currNode = currNode.next;
				counter++;
			}
		}

		if (currNode == null) {
			System.out.println(index + " position element not found");
		}

		return list;
	}

	public static void main(String[] args) {

		LinkedList4 list = new LinkedList4();

		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 7);
		list = insert(list, 8);

		printList(list);

		deleteAtPosition(list, 0);

		printList(list);

		deleteAtPosition(list, 2);

		printList(list);

		deleteAtPosition(list, 10);

		printList(list);
	}
}
