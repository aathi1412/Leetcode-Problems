
import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(maze(3, 3));
        System.out.println(mazeDiagonal(3,3, ""));
    }

    static int maze(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
    
        int left = maze(r-1, c);
        int d = maze(r - 1, c - 1);
        int right = maze(r, c-1);
        return left + right + d;
    }

    static ArrayList<String> maze(int r, int c, String p){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1){
            list.addAll(maze(r-1, c, p + "D"));
        }
        if (c > 1) {
            list.addAll(maze(r, c-1, p + "R"));
        }
        
        return list;
    }

    static ArrayList<String> mazeDiagonal(int r, int c, String p){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        

        if(r > 1){
            list.addAll(mazeDiagonal(r-1, c, p + "D"));
        }
        if(r > 1 && c > 1){
            list.addAll(mazeDiagonal(r-1, c-1, p + "d"));
        }
        
        if (c > 1) {
            list.addAll(mazeDiagonal(r, c-1, p + "R"));
        }
        
        return list;
    }
}
