package SortingAlgorithms;

public class RecursiveInsertionSort {

	public void sort(int arr[], int n) {
 
		if (n <= 1)
			return;

		sort(arr, n - 1);

		int last = arr[n - 1];
		int j = n - 2;

		while (j >= 0 && arr[j] > last) {
			arr[j + 1] = arr[j];
			j--;
		}
		arr[j + 1] = last;

	}

	public void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
