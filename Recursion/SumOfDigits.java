import java.util.Scanner;

public class SumOfDigits {
     public static int SOD(int n){
        if(n>=0 && n<=9){
            return n;
        }
        return SOD(n/10) + n%10;

    }
    public static void main(String args[]){
        System.out.print("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The sum of the digits of the entered number is: " + SOD(n));
    }
}
