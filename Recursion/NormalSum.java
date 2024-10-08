import java.util.Scanner;

public class NormalSum {
     public static int printSum(int n){
        if(n==1){
            return 1;
        }
        return printSum(n-1) + n;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = sc.nextInt();
        System.out.println("The summation of natural numbers till nth term is : "+printSum(n));


    }
}
