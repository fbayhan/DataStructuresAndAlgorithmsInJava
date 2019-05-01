import java.util.LinkedList;

import LinkedListJava.LinkedListExample;
import tricks.Recursion;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to data structures");

		Recursion recursion = new Recursion();
		System.out.println("Fibonacci : " + recursion.fibonacci(11));
		System.out.println("Factorial : " + recursion.factorial(4));

		LinkedListExample linkedListExample = new LinkedListExample();
		linkedListExample.ReadLinkedListOnJava();
		System.out.println("------------------------");
		linkedListExample.addToLinkedList("newItem");
		linkedListExample.ReadLinkedListOnJava();
		System.out.println("------------------------");
		linkedListExample.addToLinkedList(1, "New Second Item");
		linkedListExample.ReadLinkedListOnJava();

		System.out.println("------------------------");
		LinkedList<String> newLinkedList = new LinkedList<>();
		newLinkedList.add("First Item Of New Linked List");
		newLinkedList.add("Second Item Of New Linked List");
		newLinkedList.add("Third Item Of New Linked List");
		newLinkedList.add("Fifth Item Of New Linked List");
		linkedListExample.addToLinkedList(newLinkedList);
		linkedListExample.ReadLinkedListOnJava();

		System.out.println("------------------------");
		LinkedList<String> newLinkedListWirhLink = new LinkedList<>();
		newLinkedListWirhLink.add("First Item Of New Linked List");
		newLinkedListWirhLink.add("Second Item Of New Linked List");
		newLinkedListWirhLink.add("Third Item Of New Linked List");
		newLinkedListWirhLink.add("Fifth Item Of New Linked List");
		linkedListExample.addToLinkedList(2, newLinkedList);
		linkedListExample.ReadLinkedListOnJava();
		
		System.out.println("------------------------");
		

	}
}
