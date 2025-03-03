import java.util.Scanner;

public class reverseArray {

    static void ReverseArray(int arr[]) {
        int i = 0, j = arr.length-1;

        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
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
         ReverseArray(arr);
        System.out.println("The reverse array is : ");
        for(int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
