// Sort the array using two pointer. arr = {0,1,0,0,1,0,1,1}

import java.util.Scanner;

public class arraySort {

    static void sortArray(int arr[]) {
        int n = arr.length;
        int left = 0, right = n-1;

        while(left < right) {
            if(arr[left] == 1 && arr[right] == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if(arr[left] == 0) {
                left++;
            }
            if(arr[right] == 1) {
                right--;
            }
        }
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
        sortArray(arr);
        System.out.println("Array after sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
