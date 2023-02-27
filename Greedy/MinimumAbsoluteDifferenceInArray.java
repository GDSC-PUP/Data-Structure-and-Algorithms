package Greedy;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteDifferenceInArray {
    public static int minAbsoluteDiff(int []arr){
        Arrays.sort(arr);
        // Find Min Difference
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length-1; i++){
            int diff = arr[i+1] - arr[i];
            if(diff < min){
                min = diff;
            }
        }
        return min;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int []arr = new int[n];
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            int ans = minAbsoluteDiff(arr);
            System.out.println(ans);
        }
    }
}
