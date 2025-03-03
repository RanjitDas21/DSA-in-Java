// Find the unique number in a given Array where all the elements are being respected twice
// with one value being unique(Only positive elements are present in array).

import java.util.Scanner;

public class arrayManipulation {

    static int findUnique(int arr[]) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for(int i = 0; i < n; i++) {
            if(arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the "+ size + " elements of array");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int result = findUnique(arr);
        System.out.println("The unique number is : " +result);

    }
}
