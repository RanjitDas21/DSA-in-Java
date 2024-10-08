//Time complexity = O(log q).

import java.util.Scanner;

public class CalculatePower2 {
    public static int pow(int p,int q) {
        if(q == 0) return 1;
        int smallAns = pow(p,q/2);
        if(q % 2 == 0) return smallAns * smallAns;
        return p * smallAns * smallAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the p: ");
        int p = sc.nextInt();
        System.out.print("Enter the q: ");
        int q = sc.nextInt();
        System.out.println("The value of p^q is: " + pow(p,q));
    }
}
