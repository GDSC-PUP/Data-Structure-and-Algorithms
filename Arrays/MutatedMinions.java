package Arrays;

import java.util.Scanner;

public class MutatedMinions {
    public static void main (String[] args) throws java.lang.Exception
    {

        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int []arr = new int[n];
            int count = 0;
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                arr[i] += k;
                if(arr[i] % 7 == 0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
