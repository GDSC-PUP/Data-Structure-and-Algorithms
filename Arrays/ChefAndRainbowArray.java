package Arrays;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndRainbowArray
{
    public static void main (String[] args) throws java.lang.Exception
    {

        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int []arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int i = 0;
            int j = arr.length-1;
            int count = 0;
            int num = 1;
            while(i<=j){
                if(arr[i] == arr[j] && arr[i]>= 1 && arr[i]<=7){
                    if(arr[i] == num){
                        count++;
                        num++;
                    }
                }else{
                    break;
                }
                i++;
                j--;
            }
            if(count == 7 ){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}