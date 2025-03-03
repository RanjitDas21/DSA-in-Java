//Find the second maximum number of an Array(Answer always exists).

import java.util.Scanner;

public class findSecondMax {

    static int findMax(int arr[]) {
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static int findSecondMax(int arr[]) {
        int mx = findMax(arr);
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            if(arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
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
        int finalResult = findSecondMax(arr);
        System.out.println("The second maximum number is : " +finalResult);

    }
}
