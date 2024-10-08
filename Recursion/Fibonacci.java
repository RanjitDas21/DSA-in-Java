import java.util.Scanner;

public class Fibonacci {

    public static int calculateNthFibNum(int n) {
        //Base case
        if(n == 0 || n == 1) return n;

        //Subproblems -- Recursive work
        int prev = calculateNthFibNum(n-1);
        int prevPrev = calculateNthFibNum(n-2);

        //Self work
        int ans = prev + prevPrev;

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth turm of fibonacci series : ");
        int n = sc.nextInt();

        int Ans = calculateNthFibNum(n);
        System.out.printf("The %dth fibonacci number is : ",n);
        System.out.print(Ans);
    }
}
