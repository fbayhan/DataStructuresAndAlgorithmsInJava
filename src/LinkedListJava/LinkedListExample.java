package LinkedListJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	private LinkedList<String> linkedList = new LinkedList<>();

	public LinkedListExample() {
		linkedList.add("First");
		linkedList.add("Second");
		linkedList.add("Third");
		linkedList.add("Forth");

	}

	public void ReadLinkedListOnJava() {

		Iterator<String> itr = linkedList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public void addToLinkedList(String newItem) {
		linkedList.add(newItem);
		System.out.println(linkedList);
	}

	public void addToLinkedList(int place, String newItem) {
		linkedList.add(place, newItem);
		System.out.println(linkedList);
	}

	public void addToLinkedList(LinkedList<String> newLinkedList) {
		linkedList.addAll(newLinkedList);
		System.out.println(linkedList);
	}

	public void addToLinkedList(int place, LinkedList<String> newLinkedList) {
		linkedList.addAll(place, newLinkedList);
		System.out.println(linkedList);
	}
	
}
