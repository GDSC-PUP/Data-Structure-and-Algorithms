package Greedy;
import java.util.Scanner;
import java.util.Arrays;

public class FashionShow {
    public static void solve(int []men, int []women){
        Arrays.sort(men);
        Arrays.sort(women);
        int max = 0;
        for(int i=men.length-1; i>=0; i--){
            max += (men[i]*women[i]);
        }
        System.out.println(max);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int []men = new int[n];
            int []women = new int[n];
            for(int i=0; i<men.length; i++){
                men[i] = sc.nextInt();
            }
            for(int i=0; i<women.length; i++){
                women[i] = sc.nextInt();
            }
            solve(men, women);
        }
    }
}
