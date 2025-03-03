public class optimizedDeadMazePath4D {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int[][] maze = {{1,0,1,1},
                {1,1,1,1},
                {1,1,0,1}};
        printMazePath(0,0,rows-1,cols-1,"",maze);
    }

    private static void printMazePath(int sr, int sc, int er, int ec, String str, int[][] maze) {
        if(sr<0 || sc<0){
            return;
        }
        if(sr>er || sc>ec){
            return;
        }
        if(sr == er && sc == ec){
            System.out.println(str);
            return;
        }if(maze[sr][sc] == 0){
            return;
        }
        if(maze[sr][sc] == -1 ){
            return;
        }
        maze[sr][sc] = -1;

        //go right
        printMazePath(sr,sc+1,er,ec,str+"R",maze);
        //go down
        printMazePath(sr+1,sc,er,ec,str+"D",maze);
        //go left
        printMazePath(sr,sc-1,er,ec,str+"L",maze);
        //go up
        printMazePath(sr-1,sc,er,ec,str+"U",maze);
        //backtracking
        maze[sr][sc] = 1;
    }
}
