// Find the first occurrence of a given element x.Given that the array is sorted.
//if no occurrence of x is found then return -1.

public class FirstOccurrence {
    static int firstOccurrence(int arr[], int target) {
        int n = arr.length;
        int st = 0, end = n - 1;
        int firstOcc = -1;
        while(st<=end) {
            int mid = st+(end-st)/2;
            if(target == arr[mid]) {
                firstOcc = mid;
                end = mid - 1;
            }else if(target < arr[mid]) {
                end = mid - 1;
            }else {
                st = mid + 1;
            }
        }
        return firstOcc;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,4,5,5,6,7};
        int target = 2;
        System.out.println(firstOccurrence(arr, target));
    }
}
