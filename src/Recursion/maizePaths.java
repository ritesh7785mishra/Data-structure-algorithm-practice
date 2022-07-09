package Recursion;
import java.util.*;


public class maizePaths {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> paths = getMazePaths(1,1,n,m);
        System.out.println(paths);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sc==dc && sr==dr){
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        }

        ArrayList<String> vpaths= new ArrayList<String>();
        ArrayList<String> hpaths =  new ArrayList<String>();
        ArrayList<String> paths = new ArrayList<String>();

        if(sc<dc){
            hpaths = getMazePaths(sr, sc+1, dr, dc);
        }

        if(sr<dr){
            vpaths = getMazePaths(sr+1, sc, dr, dc);
        }


        for(String hpath:hpaths){
            paths.add("h"  + hpath);
        }

        for(String vpath:vpaths){
            paths.add("v" + vpath);
        }

        return paths;
 }
}
