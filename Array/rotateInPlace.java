//Rotation of a given Array by k steps without any extra space (k>=0 && k can be greater than the array length).

import java.util.Scanner;

public class rotateInPlace {

    static void reverseArr(int arr[], int st, int end) {
        while(st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }

    static void rotateArray(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        reverseArr(arr,0,n-k-1);
        reverseArr(arr,n-k, n-1);
        reverseArr(arr, 0, n-1);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the " + size + " elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value ok k :");
        int k = sc.nextInt();
        rotateArray(arr, k);
        System.out.println("Array after rotate");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

