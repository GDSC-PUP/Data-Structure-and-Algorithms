package com.company.SortingAndSearching;

import java.util.Scanner;

public class Apartments {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int []desiredSize = new int[n];
        for(int i=0; i<desiredSize.length; i++){
            desiredSize[i] = sc.nextInt();
        }
        int []apartmentSize = new int[m];
        for(int i=0; i<apartmentSize.length; i++){
            apartmentSize[i] = sc.nextInt();
        }

    }
}
