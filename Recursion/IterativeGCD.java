import java.util.Scanner;

public class IterativeGCD {
     public static int GCD(int x,int y) {
        while(x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y : ");
        int y = sc.nextInt();

        System.out.println("The greatest common diviser is : " + GCD(x,y));

    } 
}
