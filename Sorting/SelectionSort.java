public class SelectionSort {

    public static void displayArr(int[] arr) {
        for(int val : arr) {
            System.out.print(val+ " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            int minIdx = i;
            for(int j = i+1; j < n; j++) {
                if(arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            if(minIdx != i) {
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }
    }
    public static void main(String args[]) {
        int[] arr = {5, 2, 1, 9, 4, 7, 6};
        System.out.println("Array before sorting");
        displayArr(arr);
        selectionSort(arr);
        System.out.println();
        System.out.println("Array after sorting");
        displayArr(arr);
    }
    
}
