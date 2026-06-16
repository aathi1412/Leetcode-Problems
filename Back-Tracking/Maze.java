
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
        boolean[][] puzz = {
            {true, false, true},
            {true, true, true},
            {true, false, true}
        };
        int[][] path = new int[3][3];
        // System.out.println(maze(puzz, 3, 3, ""));
        maze(puzz, 0, 0, "", path, 1);
        checkRow(puzz);
    }

    private static void checkRow(boolean[][] puzz) {
        for (int i = 0; i < puzz.length; i++) {
            System.out.print(puzz[0][i] + ", ");
        }
    }

    static void maze(boolean[][] puzz, int r, int c, String p, int[][] path, int steps){
        if(r == puzz.length-1 && c == puzz[0].length-1){
            path[r][c] = steps;
            for(int[] pa: path){
                System.out.println(Arrays.toString(pa));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!puzz[r][c]) return;

        puzz[r][c] = false;
        path[r][c] = steps;
        
        if(r > 0){
            maze(puzz, r-1, c, p + 'U', path, steps+1);
        }
        if(r < puzz.length-1){
            maze(puzz, r+1, c, p + 'D', path, steps+1);
        }
        if(c < puzz[0].length-1){
            maze(puzz, r, c+1, p + 'R', path, steps+1);
        }
        if(c > 0){
            maze(puzz, r, c-1, p + 'L', path, steps+1);
        }

        puzz[r][c] = true;
        path[r][c] = 0;
    }
}
