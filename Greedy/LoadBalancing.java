package Greedy;

import java.util.Scanner;

public class LoadBalancing {
    public static int loadBalancer(int []load){
        // Find the load that is to be Equally Divided
        int loadSum = 0;
        for(int i=0; i<load.length; i++){
            loadSum += load[i];
        }
        if(loadSum % load.length != 0){
            return -1;
        }
        int loadEql = loadSum/load.length;

        // Greedy Step
        int diff = 0;
        int maxLoad = Integer.MIN_VALUE;
        for(int i=0; i<load.length; i++){
            diff += load[i] - loadEql;
            int ans = Math.max(diff, -diff);
            maxLoad = Math.max(maxLoad, ans);
        }
        return maxLoad;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int []load = new int[n];
            for(int i=0; i<load.length; i++){
                load[i] = sc.nextInt();
            }
            int ans = loadBalancer(load);
            System.out.println(ans);
        }
    }
}
