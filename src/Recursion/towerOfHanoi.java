package Recursion;
import java.util.*;

public class towerOfHanoi {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int disk = scn.nextInt();
        int t1 = scn.nextInt();
        int t2 = scn.nextInt();
        int t3 = scn.nextInt();

        toh(disk, t1 , t2 , t3);
    }
    public static void toh(int disk, int A, int B, int C){
        // expectation toh(3ABC) will move 3 disk from A to B and print the instructions
        // faith toh(2ABC) will move the 2 disks from A to B and print the instructions
        // E + F  3 ABC  == 2 ACB + move disk 3 from A to B and then move disk 2 CBA use diagram to visualise

        if(disk == 0 ){
            return;
        }

        toh(disk-1,A,C,B);
        System.out.println("disk " + disk + " moves from "+ A + " to " + B);
        toh(disk-1, C, B, A);

    }
}