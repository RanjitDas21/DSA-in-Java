public class MergeSort {

    public static void displayArr(int[] arr) {
        for(int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void merge(int[] arr,int l,int mid,int r) {
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data to temporary arrays left[] and right[]
        for(int i = 0; i < n1; i++) {
            left[i] = arr[l+i];
        }
        for(int j = 0; j < n2; j++) {
            right[j] = arr[mid+1+j];
        }

        // Merge the temporary arrays back into arr[l..r]
        int i = 0, j = 0, k = l;
        while(i < n1 && j < n2) {
            if(left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy any remaining elements of left[] if there are any
        while(i < n1) {
            arr[k++] = left[i++];
        }

        // Copy any remaining elements of right[] if there are any
        while(j < n2) {
            arr[k++] = right[j++];
        }
    }

    public static void mergeSort(int[] arr,int l,int r) {
        if(l>=r) return;
        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }
    public static void main(String[] args) {
        int[] arr = {5,2,8,1,9,11};
        int n = arr.length;
        System.out.println("Array before sorting");
        displayArr(arr);
        mergeSort(arr, 0, n-1);
        System.out.println();
        System.out.println("Array before sorting");
        displayArr(arr);
    }
}