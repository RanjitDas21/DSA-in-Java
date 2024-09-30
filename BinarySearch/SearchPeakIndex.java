/* Given a Mountain array 'a' of length greater than 3, return the index 'i' such that
 arr[0]<arr[1]<...<arr[i-1]<arr[i]>arr[i+1]>...>arr[arr.length-1].
   This index is known as the peak index.
 */

 public class SearchPeakIndex {
 
     static int findPeakIndex(int arr[]) {
         int st = 0, end = arr.length-1;
         int ans = -1;
 
         while(st <= end) {
             int mid = st + (end-st)/2;
             if(arr[mid] < arr[mid+1]) {
                 ans = mid+1;
                 st = mid+1;
             }else {
                 end = mid-1;
             }
         }
         return ans;
     }
     public static void main(String[] args) {
         int arr[] = {7,9,12,15,10,6,1};
         System.out.println(findPeakIndex(arr));
     }
 }
 