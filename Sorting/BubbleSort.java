public class BubbleSort {

    public static void printArray(int[] arr) {
        for(int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            boolean isSwap = false;
            for(int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwap = true;
                }
            }
            if(!isSwap) {
                return;
            }
        }    
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 10};
        System.out.println("Array before sorting");
        printArray(arr);
        bubbleSort(arr);
        System.out.println();
        System.out.println("Array after sorting");
        printArray(arr);
    }
    
}
