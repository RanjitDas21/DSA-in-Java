import java.util.Scanner;

public class K_Multiples {
    public static void printMultiples(int n, int k){
    if(k==1){
        System.out.println(n);
        return;
    }
    printMultiples(n,k-1);
    System.out.println(n*k);

}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        System.out.print("Enter the k: ");
        int k = sc.nextInt();

        printMultiples(n,k);

    }
}
