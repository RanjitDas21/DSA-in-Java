//  Given the rotated sorted array of integers, which contains distinct elements, and an integer target.
//  Return the index of target if it is in the array. Otherwise return -1.

public class findTarget {
    static int findTargetIndex(int arr[], int target) {
        int n = arr.length;
        int st = 0, end = n-1;
        int index = -1;
        while(st <= end) {
            int mid = st + (end-st)/2;
            if (arr[mid] == target) return mid;
            else {
                if(arr[mid] < arr[end]) {
                    if(target > arr[mid] && target <= arr[end]) {
                        st = mid + 1;
                    }else {
                        end = mid - 1;
                    }
                }else {
                    if(target >= arr[st] && target < arr[mid]) {
                        end = mid - 1;
                    }else {
                        st = mid + 1;
                    }
                }
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {9,10,11,12,1,2,3,4,5,6,7,8};
        int target = 2;
        System.out.println(findTargetIndex(arr, target));

    }
}
