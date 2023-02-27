package Arrays;

import java.util.Scanner;

public class ForgottenLanguage {
    public static void main (String[] args) throws java.lang.Exception
    {

        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String []words = new String[n];
            for(int i=0; i<n; i++){
                words[i] = sc.next();
            }
            String str = "";
            for(int i=0; i<k; i++){
                int m = sc.nextInt();
                while(m-- > 0){
                    String s = sc.next();
                    str += s;
                }
            }

            //
            for(int i=0; i<n; i++){
                if(str.contains(words[i])){
                    System.out.print("YES" + " ");
                } else {
                    System.out.print("NO" + " ");
                }
            }
            System.out.println();

        }
    }
}
