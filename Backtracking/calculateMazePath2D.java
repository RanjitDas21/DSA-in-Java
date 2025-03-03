public class calculateMazePath2D {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int count = calculateMazePath(1,1,rows,columns);
        System.out.println(count);
    }

    private static int calculateMazePath(int startingRows, int startingColumns, int endingRows, int endingColumns) {
        if (startingRows > endingRows || startingColumns > endingColumns){
            return 0;
        }
        if(startingRows == endingRows && startingColumns == endingColumns){
            return 1;
        }
        int downWays = calculateMazePath(startingRows+1,startingColumns,endingRows,endingColumns);
        int rightWays = calculateMazePath(startingRows,startingColumns+1,endingRows,endingColumns);
        int totalWays = downWays + rightWays;
        return totalWays;
    }
}
