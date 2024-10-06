import java.util.Scanner;

public class printNum1 {

    public static void printIncresing(int n) {
        if(n == 1) {
            System.out.print(n+" ");
            return;
        }
        printIncresing(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.printf("The number till %d turm is : ",n);
        printIncresing(n);

    }
}