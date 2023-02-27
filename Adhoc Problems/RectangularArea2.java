package AdhocProblems;

import java.util.Arrays;
import java.util.Scanner;

public class RectangularArea2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int []l = new int[n];
            int []h = new int[n];
            int max_l = 0;
            for(int i=0; i<n; i++){
                l[i] = sc.nextInt();
                h[i] = sc.nextInt();
                if(l[i]/2 > max_l){
                    max_l = l[i]/2;
                }
            }
            int []temp = new int[max_l + 1];
            for(int i=0; i<l.length; i++){
                temp[l[i]/2] = h[i];
            }
            int area = temp[temp.length - 1];
            System.out.println(Arrays.toString(temp));
            for(int i=temp.length-2; i>0; i--){
                if(temp[i] < temp[i+1]){
                    temp[i] = temp[i+1];
                }
                area += temp[i];
            }
            System.out.println(Arrays.toString(temp));
            System.out.println(2*area);
        }
    }
}
