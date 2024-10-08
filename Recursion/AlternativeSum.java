import java.util.Scanner;

public class AlternativeSum {
     public static int printSum(int n){
        if(n==0){
            return 0;
        }
        if(n%2==0){
            return printSum(n-1) -n;
        }else{
            return printSum(n-1) + n;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = sc.nextInt();
        System.out.println("The summation of first "+ n +" natural number is : "+printSum(n));
    }
}
