// A Rotated sorted array is a sorted array on which rotation operation has been performed some number of times.
// Given a rotated sorted array, find the index of the minimum element in this array.
// It is guaranteed that all the elements in the array are unique.

public class findMinimum {

    static int findMinimumIndex(int arr[]) {
        int n = arr.length;
        int st = 0, end = n-1;
        int index = -1;

        while(st <=end) {
            int mid = st + (end-st)/2;
            if(arr[mid] > arr[n-1]) {
                st = mid+1;
            }else if(arr[mid] <= arr[n-1]) {
                index = mid;
                end = mid-1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = {12,11,10,9,8,1,2,3,4,5,6,7};
        int ans = findMinimumIndex(arr);
        System.out.println(ans);
    }
}
