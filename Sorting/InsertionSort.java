public class InsertionSort {

    public static void displayArr(int[] arr) {
        for(int val : arr) {
            System.out.print(val+ " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }

        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 3, 11,7};
        System.out.println("Array before sorting");
        displayArr(arr);
        insertionSort(arr);
        System.out.println();
        System.out.println("Array after sorting");
        displayArr(arr);
    }
    
}
