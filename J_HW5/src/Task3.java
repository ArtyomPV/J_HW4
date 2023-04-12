
// Реализовать алгоритм пирамидальной сортировки (HeapSort).

public class Task3 {


    private static int LEFT(int i) {
        return (2 * i + 1);
    }


    private static int RIGHT(int i) {
        return (2 * i + 2);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void heapify(int[] arr, int i, int size) {
        int left = LEFT(i);
        int right = RIGHT(i);

        int largest = i;

        if (left < size && arr[left] > arr[i]) {
            largest = left;
        }

        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest, size);
        }
    }

    private static int pop(int[] arr, int size) {
        if (size <= 0) {
            return -1;
        }
        int top = arr[0];
        arr[0] = arr[size - 1];
        heapify(arr, 0, size - 1);

        return top;
    }

    public static void heapsort(int[] arr) {
        int n = arr.length;
        int i = (n - 2) / 2;
        while (i >= 0) {
            heapify(arr, i--, n);
        }

        while (n > 0) {
            arr[n - 1] = pop(arr, n);
            n--;
        }
    }
}