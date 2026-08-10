

class QuickSort {

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[low];

        int i = low;
        int j = high;

        while (i < j) {

            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }

            if (i < j) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Put pivot in its correct position
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    static void qs(int[] arr, int low, int high) {

        if (low < high) {

            int pIndex = partition(arr, low, high);

            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }

    

    public static void main(String[] args) {

        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
          qs(arr, 0, arr.length - 1);
for (int num : arr) {
            System.out.print(num + " ");
}
    }
}