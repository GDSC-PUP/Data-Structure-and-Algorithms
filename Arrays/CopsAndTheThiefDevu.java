package Arrays;

import java.util.Scanner;

public class CopsAndTheThiefDevu {
    public static void main (String[] args) throws java.lang.Exception
    {

        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int []arr = new int[m];
            for(int i=0; i<m; i++){
                arr[i] = sc.nextInt();
            }

            int dist = x*y;
            int count = 0;
            for(int i=1; i<= 100; i++){
                boolean isSafe = true;
                for(int j=0; j<m; j++){
                    int leftRange = Math.max(arr[j] - dist,1);
                    int rightRange = Math.min(arr[j] + dist,100);
                    if(i >= leftRange && i<= rightRange){
                        isSafe = false;
                    }
                }
                if(isSafe){
                    count+=1;
                }
            }
            System.out.println(count);
        }
    }
}
