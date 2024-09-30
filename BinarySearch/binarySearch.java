public class binarySearch {
    public static void main(String[] args) {
        int arr [] = {1,2,4,6,7,9};
        int target = 4;

        System.out.println(searchBinary(arr, target));
    }

    private static boolean searchBinary(int[] arr, int target) {
        int n = arr.length;
        int st = 0, end = n-1;

        while(st <= end) {
            int mid = st+(end-st)/2;
            if(target == arr[mid]) {
                return true;
            } else if(target > arr[mid]) {
                st = mid + 1;
            }else {
                end = mid - 1;
            }

        }
        return false;
    }
}
