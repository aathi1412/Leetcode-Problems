
public class SodukuSolver {
    public static void main(String[] args) {
        char[][] board = {  {'5','3','.','.','7','.','.','.','.'},
                            {'6','.','.','1','9','5','.','.','.'},
                            {'.','9','8','.','.','.','.','6','.'},
                            {'8','.','.','.','6','.','.','.','3'},
                            {'4','.','.','8','.','3','.','.','1'},
                            {'7','.','.','.','2','.','.','.','6'},
                            {'.','6','.','.','.','.','2','8','.'},
                            {'.','.','.','4','1','9','.','.','5'},
                            {'.','.','.','.','8','.','.','7','9'}
                        };
        if(solve(board)){
            display(board);
        }else{
            System.out.println("cannot");
        }
    }

    private static void display(char[][] board) {
        for (char[] row : board) {
            for (char num : row) {
                System.out.print(num + ", ");
            }
            System.out.println();
        }
    }

    static boolean solve(char[][] board){
        int row = -1;
        int col = -1;

        boolean foundEmpty = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == '.'){
                    row = i; 
                    col = j;
                    foundEmpty = true;
                    break;
                }
            }
            if(foundEmpty) break;
        }

        if(!foundEmpty){
            return true;
        }
        for (char num = '1'; num <= '9'; num++) {
            if(isSafe(board, row, col, num)){
                board[row][col] = num;
                if(solve(board)){
                    return true;
                }else{
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }

    private static boolean isSafe(char[][] board, int row, int col, char num) {
        // row - horizontal
        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == num){
                return false;
            }
        }
        // col - vertical
        for (int i = 0; i < board.length; i++) {
            if(board[i][col] == num){
                return false;
            }
        }
        //  3 x 3
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int i = rowStart; i < rowStart + sqrt; i++) {
            for (int j = colStart; j < colStart + sqrt; j++) {
                if(board[i][j] == num){
                    return false;
                }
            }
        }

        return true;
    }
}
