package Recursion;
import java.util.*;
import java.io.*;

public class getKPC{

    static  String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String key = scn.next();
        ArrayList<String> words = getKPC(key);
        System.out.println(words);


    }

    public static ArrayList<String> getKPC(String str) {

        if(str.length() == 0 ){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();


        String codeforch = codes[ch- '0'];

        for(int i=0; i< codeforch.length(); i++){
            for(String value: rres){
                mres.add(codeforch.charAt(i) + value);
            }
        }
        return mres;
    }
}
