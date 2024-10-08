//Euclid's Algorithm:
//GCD(x,y) = Recursion.GCD(y,x%y)
//GCD(x,0) = x

import java.util.Scanner;

public class GCD {
     public static int calculateGCD(int x,int y){
        if(y == 0){
            return x;
        }
        return calculateGCD(y,x%y);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x : ");
        int x = sc.nextInt();
        System.out.print("Enter the y : ");
        int y = sc.nextInt();
        System.out.println("GCD of x and y is : "+calculateGCD(x,y));
    }
}
