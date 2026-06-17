
import java.util.ArrayList;

public class MazeWithObstacles {
    public static void main(String[] args) {
        Boolean[][] puzz = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        System.out.println(mazeRun(puzz, 3, 3, ""));

    }

    static int maze(Boolean[][] puzz, int r, int c){
        if(r == puzz.length-1 || c == puzz[0].length-1){
            return 1;
        }
        int left = 0, right = 0;
        if(!puzz[r][c]){
            return 0;
        }
        if(r < 3){
            left = maze(puzz, r+1, c);
        }
        if(c < 3){
            right = maze(puzz, r, c+1);
        }
        return left+right;
    }
    static int mazee(Boolean[][] puzz, int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = 0, right = 0;
        if(!puzz[r-1][c-1]){
            return 0;
        }
        if(r > 1){
            left = mazee(puzz, r-1, c);
        }
        if(c > 1){
            right = mazee(puzz, r, c-1);
        }
        return left+right;
    }

    static void mazee(Boolean[][] puzz, int r, int c, String p){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        // int left = 0, right = 0;
        if(!puzz[r-1][c-1]){
            return;
        }
        if(r > 1){
            mazee(puzz, r-1, c, p + 'D');
        }
        if(c > 1){
            mazee(puzz, r, c-1, p + 'R');
        }
        return;
    }

    static ArrayList<String> mazeRun(Boolean[][] puzz, int r, int c, String p){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(!puzz[r-1][c-1]){
            return new ArrayList<>();
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1){
            list.addAll(mazeRun(puzz, r-1, c, p + 'D'));
        }
        if(c > 1){
            list.addAll(mazeRun(puzz, r, c-1, p + 'R'));
        }
        return list;
    }
}
