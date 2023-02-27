package AdhocProblems;

import java.util.Scanner;

public class Equalize {
    public static void adhoc(String s, String t){
        int cost = 0;
        for(int i = 0; i<s.length(); ){
            if(s.charAt(i) != t.charAt(i)){
                // Either Swap or Flip
                if(i+1 < s.length() && s.charAt(i) != s.charAt(i+1) && s.charAt(i+1) != t.charAt(i+1)){
                    i+= 2;
                }else{
                    i++;
                }
                cost++;
            } else{
                i++;
            }
        }
        System.out.println(cost);
    }
//    public static void adhoc(String s, String t){
//        int cost = 0;
//        for(int i=0; i<s.length(); ){
//            if(i < s.length() && s.charAt(i) == t.charAt(i)){
//                i++;
//            }
//            // Swap
//            if(i < s.length()-1 && s.charAt(i) != s.charAt(i+1) && s.charAt(i+1) != t.charAt(i+1)){
//                cost++;
//                i+=2;
//            } else if(i < s.length() && s.charAt(i) != t.charAt(i)) {
//                cost++;
//                i++;
//            }
//        }
//        System.out.println(cost);
//    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
         String s = sc.next();
         String t = sc.next();
         adhoc(s, t);
        }
    }
}
