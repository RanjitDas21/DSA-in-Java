public class deadMazePath4D {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int[][] maze = {{1,0,1,1},
                {1,1,1,1},
                {1,1,0,1}};
        boolean[][] isVisited = new boolean[rows][cols];
        printMazePath(0,0,rows-1,cols-1,"",maze,isVisited);
    }

    private static void printMazePath(int sr, int sc, int er, int ec, String str, int[][] maze,boolean[][] isVisited) {
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
        if(isVisited[sr][sc] == true ){
            return;
        }
        isVisited[sr][sc] = true;

        //go right
        printMazePath(sr,sc+1,er,ec,str+"R",maze,isVisited);
        //go down
        printMazePath(sr+1,sc,er,ec,str+"D",maze,isVisited);
        //go left
        printMazePath(sr,sc-1,er,ec,str+"L",maze,isVisited);
        //go up
        printMazePath(sr-1,sc,er,ec,str+"U",maze,isVisited);
        //backtracking
        isVisited[sr][sc] = false;
    }
}
