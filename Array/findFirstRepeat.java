// Given an Array "arr" consisting of integer. Return the first value that is repeating in this array.
// If no value is being repeated,return -1.

import java.util.Scanner;

public class findFirstRepeat {

    static int findFirstRepeatingNumber(int arr[]) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
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
        int finalResult = findFirstRepeatingNumber(arr);
        System.out.println("The first repeating number is : " +finalResult);

    }
}
