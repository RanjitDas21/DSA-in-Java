// Count the number of triple whose sum is equal to the given value x.

import java.util.Scanner;

public class tripleSum {

    static int pairSum(int arr[], int terget) {
        int ans = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                for(int k = j+1; k < arr.length; k++) {
                    if(arr[i] + arr[j] + arr[k] == terget) {
                        ans++;
                    }

                }
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
        System.out.println("Enter the terget");
        int terget = sc.nextInt();
        int result = pairSum(arr, terget);
        System.out.println("The possible pair of number is : " +result);

    }
}
