import java.util.Scanner;

public class Factorial {
    public static int calculateFactorial(int n) {
        //Base case or Halting condition
        if(n == 0) return 1;

        //Recursive work
        int smallAns = calculateFactorial(n-1);

        //Self work
        int ans = n * smallAns;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        
        int fact = calculateFactorial(n);
        System.out.printf("The factorial of %d is : ",n);
        System.out.print(fact);
    }
}
