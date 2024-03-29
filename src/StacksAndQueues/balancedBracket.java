package StacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class balancedBracket {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }else if(ch==')'||ch=='}'||ch==']'){
                if(ch==')' && st.peek() == '(') {
                    st.pop();
                }else if(ch==']' && st.peek() == '['){
                    st.pop();
                }else if(ch=='}' && st.peek() == '{'){
                    st.pop();
                }else{
                    System.out.println(false);
                    return;
                }
            }
        }

        System.out.println(true);
    }
}
