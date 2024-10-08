import java.util.Scanner;

public class FibonacciSeries {
    public static int printFibSeries(int n) {
        //Base case
        if(n == 0 || n == 1) return n;

        //Subproblems -- Recursive work
        int prev = printFibSeries(n-1);
        int prevPrev = printFibSeries(n-2);

        //Self work
        int ans = prev + prevPrev;

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = sc.nextInt();

        System.out.printf("The fibonacci series till %dth turm is : ",n);
        for(int i = 0; i <= n; i++) {
            System.out.print(printFibSeries(i)+" ");
        }
    }
}
