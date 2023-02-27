package Greedy;

import java.util.Scanner;
import java.util.Arrays;
public class Chopsticks {
    public static int chopsticksPossible(int []chopsticks, int d){
        // Step1: Sort chopsticks
        Arrays.sort(chopsticks);
        int count = 0;
        for(int i=0; i<chopsticks.length-1;){
            if(chopsticks[i+1] - chopsticks[i] <= d){
                i+=2;
                count++;
            } else {
                i++;
            }
        }
        return count;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int d = sc.nextInt();
            int []chopsticks = new int[n];
            for(int i=0; i<n; i++){
                chopsticks[i] = sc.nextInt();
            }
            int ans = chopsticksPossible(chopsticks, d);
            System.out.println(ans);
        }
    }
}
