import java.util.LinkedList;

import LinkedListJava.LinkedListExample;
import SortingAlgorithms.BubbleSort;
import SortingAlgorithms.InsertionSort;
import SortingAlgorithms.IterativeMergeSort;
import SortingAlgorithms.MergeSort;
import SortingAlgorithms.QuickSort;
import SortingAlgorithms.RecursiveInsertionSort;
import SortingAlgorithms.SelectionSort;
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

		CreateRandomArray createRandomArray = new CreateRandomArray();
		int[] randomArray = createRandomArray.randomArray(50);

//		for (int i = 0; i < randomArray.length; i++) {
//			System.out.println(randomArray[i]);
//		}

		SelectionSort selectionSort = new SelectionSort();
		System.out.println("Selection Sort");
		selectionSort.printArray(randomArray);
		selectionSort.sort(randomArray);
		selectionSort.printArray(randomArray);

		int[] randomArray2 = createRandomArray.randomArray(50);
		BubbleSort bubbleSort = new BubbleSort();
		System.out.println("Buble Sort");
		bubbleSort.printArray(randomArray2);
		bubbleSort.sort(randomArray2);
		bubbleSort.printArray(randomArray2);

		int[] randomArray3 = createRandomArray.randomArray(50);
		InsertionSort insertionSort = new InsertionSort();
		System.out.println("Insertion Sort");
		insertionSort.printArray(randomArray3);
		insertionSort.sort(randomArray3);
		insertionSort.printArray(randomArray3);

		int[] randomArray4 = createRandomArray.randomArray(50);
		RecursiveInsertionSort recursiveInsertionSort = new RecursiveInsertionSort();
		System.out.println("Recursive Insertion Sort");
		recursiveInsertionSort.printArray(randomArray4);
		recursiveInsertionSort.sort(randomArray4, randomArray4.length);
		recursiveInsertionSort.printArray(randomArray4);

		int[] randomArray5 = createRandomArray.randomArray(50);
		MergeSort mergeSort = new MergeSort();
		System.out.println("Merge Sort ");
		mergeSort.printArray(randomArray5);
		mergeSort.sort(randomArray5, 0, randomArray5.length - 1);
		mergeSort.printArray(randomArray5);

		int[] randomArray6 = createRandomArray.randomArray(50);
		IterativeMergeSort iterativeMergeSort = new IterativeMergeSort();
		System.out.println("Iterative Merge Sort");
		iterativeMergeSort.printArray(randomArray6);
		iterativeMergeSort.mergeSort(randomArray6);
		iterativeMergeSort.printArray(randomArray6);

		int[] randomArray7 = createRandomArray.randomArray(50);
		QuickSort quickSort = new QuickSort();
		System.out.println("Quick Sort");
		quickSort.printArray(randomArray7);
		quickSort.sort(randomArray7);
		quickSort.printArray(randomArray7);
	}
}
