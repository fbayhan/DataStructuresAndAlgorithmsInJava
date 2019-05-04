package SortingAlgorithms;

public class QuickSort {

	private int temp_array[];
	private int len;

	public void sort(int[] nums) {

		if (nums == null || nums.length == 0) {
			return;
		}
		this.temp_array = nums;
		len = nums.length;
		quickSort(0, len - 1);
	}

	private void quickSort(int low_index, int high_index) {

		int i = low_index;
		int j = high_index;
		int pivot = temp_array[low_index + (high_index - low_index) / 2];
		while (i <= j) {
			while (temp_array[i] < pivot) {
				i++;
			}
			while (temp_array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchangeNumbers(i, j);
				i++;
				j--;
			}
		}
		if (low_index < j)
			quickSort(low_index, j);
		if (i < high_index)
			quickSort(i, high_index);
	}

	private void exchangeNumbers(int i, int j) {
		int temp = temp_array[i];
		temp_array[i] = temp_array[j];
		temp_array[j] = temp;
	}

	public void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
