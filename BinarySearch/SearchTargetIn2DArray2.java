/* Write an efficient algorithm that searches for a value target in an m x n integer matrix.
   This matrix has the following properties :
               1. Integers in each row are sorted in ascending from left to right.
               2. Integers in each column are sorted in ascending from top to bottom .
 */

public class SearchTargetIn2DArray2 {
    public static void main(String[] args) {
        int arr[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 12;
        System.out.println(findElement(arr, target));
    }

    private static boolean findElement(int[][] arr, int target) {
        int n = arr.length, m = arr[0].length;
        int i = 0, j = m-1;

        while(i < n && j >= 0) {
            if(arr[i][j] == target) return true;
            if(target < arr[i][j]) {
                j--;
            }else {
                i++;
            }
        }
        return false;
    }
}
