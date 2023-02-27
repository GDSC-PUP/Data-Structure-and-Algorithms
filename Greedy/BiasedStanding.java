package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BiasedStanding {
    public static int minimumBias(int []requiredRanks){
        // Find max
        int max = Integer.MIN_VALUE;
        for(int rank: requiredRanks){
            if(rank > max){
                max = rank;
            }
        }
        // create Count Array
        int []count = new int[max+1];
        for (int rank: requiredRanks){
            count[rank]++;
        }
        // Now Apply Greedy Approach
        int availableRank = 1;
        int res = 0;
        System.out.println(Arrays.toString(count));
        for(int i=0; i<count.length; i++){
            while(count[i] != 0){
                res += Math.abs(i - availableRank);
                count[i]--;
                availableRank++;
            }
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
