package Recursion;

import java.util.Scanner;

public class displayArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        display(arr, n-1);
    }
    public static void display(int[] arr, int idx){
        if(idx == 0){
            System.out.println(arr[idx]);
            return;
        }
        display(arr, idx -1); // faith prints all the elements from 0 to n-1;
        System.out.println(arr[idx]);


    }
}
