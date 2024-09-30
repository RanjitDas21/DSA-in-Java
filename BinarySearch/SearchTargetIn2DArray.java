/*  Search gut target value in a 2D integer matrix of dimensions n x m and return true found, else return false .
This matrix has the following properties :
                  1. integers in each row are sorted from left to right.
                  2. The first integer of each row is greater than the last integer of the previous row .
 */

public class SearchTargetIn2DArray {
    public static void main(String[] args) {
        int arr[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 5;
        System.out.println(SearchElementInMatrix(arr, target));
    }

    private static boolean SearchElementInMatrix(int[][] arr, int target) {
        // number of rows = n, number of columns = m
        int n = arr.length, m = arr[0].length;
        int st = 0, end = n*m - 1;

        while(st <= end) {
            int mid = st + (end-st)/2;
            int midElement = arr[mid/m][mid%m];
            if(midElement == target) return true;
            else if(target < midElement) {
                end = mid - 1;
            }else {
                st = mid + 1;
            }
        }
        return false;
    }
}
