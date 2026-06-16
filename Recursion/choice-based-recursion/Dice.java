

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        int s = 4;
        System.out.println(dice("", s));
        
        System.out.println(diceFace("", s, 8));
    }

    static ArrayList<String> dice(String p, int up){
        if(up == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> res = new ArrayList<>();

        for (int i = 1; i <= up; i++) {
            res.addAll(dice(p + i, up - i));
        }
        return res;
    }

    static ArrayList<String> diceFace(String p, int up, int face){
        if(up == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> res = new ArrayList<>();

        for (int i = 1; i <= up && i <= face; i++) {
            res.addAll(diceFace(p + i, up - i, face));
        }
        return res;
    }
}