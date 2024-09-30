public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,7,9};
        int target = 7;
        int n = arr.length;

        System.out.println(recursiveBinarySearch(arr, 0, n-1, target));
    }

    private static boolean recursiveBinarySearch(int[] arr, int st, int end, int target) {
        if(st > end) {
            return false;
        }
        int mid = st + (end-st)/2;
        if(target == arr[mid]) {
            return true;
        } else if (target < arr[mid]) {
            return recursiveBinarySearch(arr, st, mid-1, target);
        }else {
            return recursiveBinarySearch(arr,mid+1, end, target);
        }
    }
    
}
