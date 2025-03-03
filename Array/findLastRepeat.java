// Given an Array "arr" consisting of integer. Return the last value that is repeating in this array.
// If no value is being repeated,return -1.

import java.util.Scanner;

public class findLastRepeat {
    static int findLastRepeatingNumber(int arr[]) {
        int n = arr.length;
        int ans = -1;

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    ans = arr[i];
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
        int finalResult = findLastRepeatingNumber(arr);
        System.out.println("The last repeating number is : " +finalResult);

    }
}
