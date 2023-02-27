package Greedy;

import java.util.Scanner;
import java.util.Arrays;

public class BiasedStandingConcept {
    public static int minimumBias(int []requiredRanks){
        Arrays.sort(requiredRanks);
        int res = 0;
        int rank = 1;
        for (int requiredRank : requiredRanks) {
            res += Math.abs(rank - requiredRank);
            rank++;
        }
        return res;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int []requiredRanks = new int[n];
            for(int i=0; i<requiredRanks.length; i++){
                requiredRanks[i] = sc.nextInt();
            }
            int ans = minimumBias(requiredRanks);
            System.out.println(ans);
        }
    }
}
