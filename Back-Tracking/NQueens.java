
public class NQueens {
    public static void main(String[] args) {
        boolean[][] puzz = new boolean[5][4];
        queens(puzz, 0);
    }

    static void queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return;
        }

        for (int col = 0; col < board[0].length; col++) {
            if(isSafe(board, row, col)){
                board[row][col] = true;
                queens(board, row+1);
                board[row][col] = false;
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // up
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }
        // diagonal left
        int maxLeftMove = Math.min(row, col);
        for (int i = 1; i <= maxLeftMove; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }
        // diagonal right
        int maxRightMove = Math.min(row, board[0].length-col-1);
        for (int i = 1; i <= maxRightMove; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] booleans : board) {
            for (boolean bool : booleans) {
                if(bool){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }   
            }
            System.out.println();
        }
    }
}
