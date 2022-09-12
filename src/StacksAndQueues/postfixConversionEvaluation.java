package StacksAndQueues;
import java.io.*;
import java.util.*;


public class postfixConversionEvaluation {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String exp = br.readLine();
            // code++
            // exp is the string.
            Stack<Integer> valueStack = new Stack<>();
            Stack<String> infixStack = new Stack<>();
            Stack<String> prefixStack = new Stack<>();

            for(int i=0; i<exp.length(); i++){
                char ch = exp.charAt(i);
                if(ch >= '0' && ch <= '9'){
                    valueStack.push(ch - '0');
//                    System.out.print(ch - '0');
                    prefixStack.push(ch + "");
//                    System.out.print(ch + "");
                    infixStack.push(ch + "");
                }
                if( ch == '+' || ch == '-' || ch=='*' || ch == '/'){
                    vstcon(valueStack,ch);
                    instcon(infixStack,ch);
                    prestcon(prefixStack,ch);
                }


            }

            System.out.println(valueStack.peek());
            System.out.println(infixStack.peek());
            System.out.println(prefixStack.peek());



        }

        public static void vstcon(Stack<Integer> s, char ch){
//            System.out.println("hi i am being called 1" );
            int v2 = s.pop();
            int v1 = s.pop();

            if(ch =='+'){
                s.push(v1 + v2);
            }else if(ch =='-'){
                s.push(v1 - v2);
            }else if(ch =='*'){
                s.push(v1 * v2);
            }else if(ch =='/'){
                s.push(v1 / v2);
            }
         }
        public static void instcon(Stack<String> s, char ch){
//            System.out.println("hi i am being called 2");
            String v2 = s.pop();
            String v1 = s.pop();
            s.push("(" + v1 + ch + v2+ ")");
//            if(ch =='+'){
//                s.push("(" + v1 + ch + v2+ ")");
//            }else if(ch =='-'){
//                s.push("(" + v1 + ch + v2+ ")");
//            }else if(ch =='*'){
//                s.push("(" + v1 + ch + v2+ ")");
//            }else if(ch =='/'){
//
//            }
         }
        public static void prestcon(Stack<String> s, char ch){
//            System.out.println("hi i am being called 3");
            String v2 = s.pop();
            String v1 = s.pop();
            s.push(ch + v1 + v2);
//            if(ch =='+'){
//                s.push(ch + v1 + v2);
//            }else if(ch =='-'){
//                s.push(ch + v1 + v2);
//            }else if(ch =='*'){
//                s.push(ch + v1 + v2);
//            }else if(ch =='/'){
//                s.push(ch + v1 + v2);
//            }
         }
    }

