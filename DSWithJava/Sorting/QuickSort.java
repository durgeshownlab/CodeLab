public class QuickSort {
	public static void printArray(int A[]) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}

	static int partition(int A[], int low, int high) {
		int pivot = A[low];
		int i = low + 1;
		int j = high;
		int temp;
		System.out.println("1");
		do {
			while (A[i] <= pivot) {
				i++;
			}

			while (A[j] > pivot) {
				j--;
			}

			if (i < j) {
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		} while (i < j);

		temp = A[low];
		A[low] = A[j];
		A[j] = temp;

		return j;
	}

	public static void quickSort(int A[], int low, int high) {
		int partitionIndex;
		if (low < high) {
			partitionIndex = partition(A, low, high);
			quickSort(A, low, partitionIndex - 1);
			quickSort(A, partitionIndex + 1, high);
		}
	}

	public static void main(String[] args) {
		int A[] = {2, 3, 9, 7, 8, 3, 4, 6, 5};
		printArray(A);
		quickSort(A, 0, A.length - 1);
		printArray(A);
	}
}