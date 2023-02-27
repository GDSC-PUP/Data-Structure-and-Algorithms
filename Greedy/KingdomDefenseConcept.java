package Greedy;

import java.util.Scanner;
import java.util.Arrays;

public class KingdomDefenseConcept {
    public static int kingdomDefence(int []x, int []y, int w, int h){
        // Sort x Co-Ordinate
        Arrays.sort(x);
        // Sort y Co-Ordinate
        Arrays.sort(y);
        // find delta x and delta y
        int dx = x[0]-1;
        int dy = y[0]-1;
        // difference between Consecutive Towers
        for(int i=1; i<x.length; i++){
            dx = Math.max(dx, x[i] - x[i-1] - 1);
            dy = Math.max(dy, y[i] - y[i-1] - 1);
        }
        // handle Corner Cases (last tower to grid end)
        dx = Math.max(dx, w-x[x.length-1]);
        dy = Math.max(dy, h-y[y.length-1]);
        return dx*dy;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            // Take width height and Number of Towers in a Grid
            int w = sc.nextInt();
            int h = sc.nextInt();
            int n = sc.nextInt();
            int []x = new int[n];
            int []y = new int[n];
            for(int i=0; i<n; i++){
                x[i] = sc.nextInt();
                y[i] = sc.nextInt();
            }
            int ans = kingdomDefence(x, y, w, h);
            System.out.println(ans);
        }
    }
}
