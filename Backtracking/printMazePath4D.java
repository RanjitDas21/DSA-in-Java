public class printMazePath4D {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 3;
        boolean[][] isVisited = new boolean[rows][cols];
        printMazePath(0,0,rows-1,cols-1,"",isVisited);

    }

    private static void printMazePath(int sr, int sc, int er, int ec, String str,boolean[][] isVisited) {

        if(sr<0 || sc<0){
            return;
        }
        if(sr>er || sc>ec){
            return;
        }
        if(isVisited[sr][sc] == true){
            return;
        }
        if(sr == er && sc == ec){
            System.out.println(str);
            return;
        }
        isVisited[sr][sc] = true;
        //go right
        printMazePath(sr,sc+1,er,ec,str+"R",isVisited);
        //go down
        printMazePath(sr+1,sc,er,ec,str+"D",isVisited);
        //go left
        printMazePath(sr,sc-1,er,ec,str+"L",isVisited);
        //go up
        printMazePath(sr-1,sc,er,ec,str+"U",isVisited);
        //backtracking
        isVisited[sr][sc] = false;
    }
}
