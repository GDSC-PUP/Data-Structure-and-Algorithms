package Greedy;

import java.util.Scanner;
import java.util.Arrays;

public class LittleElephantAndMusic {
    public static void solve(int []band, int []length){
        Arrays.sort(band);
        Arrays.sort(length);
        int sweetness = 0;
        for(int i=0; i<band.length; i++){
            sweetness += (band[i]*length[i]);
        }
        System.out.println(sweetness);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int []band = new int[n];
            int []length = new int[n];
            for(int i=0; i<n; i++){
                band[i] = sc.nextInt();
                length[i] = sc.nextInt();
            }
            solve(band, length);
        }
    }
}
