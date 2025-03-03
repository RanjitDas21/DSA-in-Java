//Find the second minimum number of an Array(Answer always exists).

import java.util.Scanner;

public class findSecondMin {
    static int findMin(int arr[]) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int findSecondMin(int arr[]) {
        int min = findMin(arr);
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            if(arr[i] == min) {
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int secondMin = findMin(arr);
        return secondMin;
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
        int finalResult = findSecondMin(arr);
        System.out.println("The second minimum number is : " +finalResult);

    }
}
