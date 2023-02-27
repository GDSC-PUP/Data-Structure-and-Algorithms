package com.company.SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FerrisWheel {
    static class FastReader{
        BufferedReader br ;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while(st==null || !st.hasMoreElements()){try {st = new StringTokenizer(br.readLine());}catch(IOException e) {e.printStackTrace();}}
            return st.nextToken();
        }
        int nextInt(){return Integer.parseInt(next());}
        long nextLong(){return  Long.parseLong(next());}
        double nextDouble(){return Double.parseDouble(next());}
        float nextFloat(){return Float.parseFloat(next());}
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            }catch(IOException e) {
                e.printStackTrace();
            }
            return str ;
        }
    }
    public static int solve(int maxWeight, int []weight){
        // Sort weight Array
        Arrays.sort(weight);
        int count = 0;
        int start = 0;
        int end = weight.length-1;
        while(start <= end){
            if(weight[start] + weight[end] <= maxWeight){
                start++;
            }
            end--;
            count++;
        }
        return count;
    }
    public static void main(String []args){
        FastReader sc = new FastReader();
//        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxWeight = sc.nextInt();
        int []weight = new int[n];
        for(int i=0; i<n; i++){
            weight[i] = sc.nextInt();
        }
        int res = solve(maxWeight, weight);
        System.out.println(res);
    }
}
