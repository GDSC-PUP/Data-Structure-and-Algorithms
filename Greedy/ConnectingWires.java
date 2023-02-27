package Greedy;

import java.util.Scanner;
import java.util.Arrays;

public class ConnectingWires {
    public static int minimumLengthOfWire(int []whiteDots, int []blackDots){
        Arrays.sort(whiteDots);
        Arrays.sort(blackDots);
        int wireLength = 0;
        for(int i=0; i<whiteDots.length; i++){
            wireLength += Math.abs(whiteDots[i] - blackDots[i]);
        }
        return wireLength;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int []whiteDots = new int[n];
            int []blackDotes = new int[n];
            for(int i=0; i<whiteDots.length; i++){
                whiteDots[i] = sc.nextInt();
            }
            for(int i=0; i<blackDotes.length; i++){
                blackDotes[i] = sc.nextInt();
            }
            int ans = minimumLengthOfWire(whiteDots, blackDotes);
            System.out.println(ans);
        }
    }
}
