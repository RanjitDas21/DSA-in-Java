import java.util.Scanner;

public class printMazePath2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int rows = sc.nextInt();
        System.out.print("Enter the cols :");
        int cols = sc.nextInt();
        printMazePath(1,1,rows,cols,"");
    }

    private static void printMazePath(int sr, int sc, int er, int ec, String str) {
        if(sr>er || sc>ec){
            return;
        }
        if(sr == er && sc == ec){
            System.out.println(str);
            return;
        }
        //go right
        printMazePath(sr,sc+1,er,ec,str+"R");
        //go down
        printMazePath(sr+1,sc,er,ec,str+"D");
    }
}
