//Rotation of a given Array by k steps (k>=0 && k can be greater than the array length).

import java.util.Scanner;

public class arrayRotation {

    static int[] rotateArray(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        int ans[] = new int[n];
        int j = 0;

        for(int i = n-k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for(int i = 0; i < n-k; i++) {
            ans[j++] = arr[i];
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
        System.out.println("Enter the value ok k :");
        int k = sc.nextInt();
        int ans[] = rotateArray(arr, k);
        System.out.println("Array after rotate");
        for(int val : ans) {
            System.out.print(val + " ");
        }

    }
}
