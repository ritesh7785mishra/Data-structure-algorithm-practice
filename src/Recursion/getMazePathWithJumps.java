package Recursion;
import java.util.*;

public class getMazePathWithJumps {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int m= scn.nextInt();

        ArrayList<String> paths = getMazePaths(1,1,n,m);
        System.out.println(paths);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        ArrayList<String> paths= new ArrayList<String>();

        if(dc==sc && dr==sr){
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        }

        //horizontal paths

        for(int ms=1; ms<=dc-sc; ms++){
            ArrayList<String> hpaths = getMazePaths(sr, sc+ms, dr, dc);
            for(String hpath:hpaths){
                paths.add("h"+ms+hpath);
            }
        }

        //vertical paths

        for(int ms=1; ms<=dr-sr; ms++){
            ArrayList<String> vpaths = getMazePaths(sr+ms, sc, dr, dc);
            for(String vpath:vpaths){
                paths.add("v"+ms+vpath);
            }
        }

        //diagonal paths

        for(int ms=1; ms <= dc-sc && ms<= dr-sr; ms++){
            ArrayList<String> dpaths = getMazePaths(sr+ms, sc+ms, dr, dc);
            for(String dpath:dpaths){
                paths.add("d"+ms+dpath);
            }
        }
        return paths;

    }

}
