//Move the all even elements at the beginning of the array.Relative order does not matter.

import java.util.Scanner;

public class arraySort2 {

    static void sortArrayByParity(int arr[]) {
        int n = arr.length;
        int left = 0, right = n-1;

        while(left < right) {
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if(arr[left] % 2 == 0) {
                left++;
            }
            if(arr[right] % 2 == 1) {
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
        sortArrayByParity(arr);
        System.out.println("Array after sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
