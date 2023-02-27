package com.company.SortingAndSearching;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctNumbers {
    public static int partition(int []arr, int start, int end){
        int pivot = arr[start];
        int i = start+1;
        int j = end;
        do {
            while (i < end && pivot >= arr[i]) {
                i++;
            }
            while (j > start && pivot < arr[j]) {
                j--;
            }
            // swap
            if(i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }while(i<j);

        // Now Swap pivot with j
        int temp = arr[start];
        arr[start] = arr[j];
        arr[j] = temp;
        return j;
    }
    public static void quickSort(int []arr, int start, int end){
        if(start < end){
            int partitionIndex = partition(arr, start, end);
            quickSort(arr, start, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }
    public static void sort(int []arr){
        // Use Quick Sort to solve this Array
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static int solve(int []arr){
        // Sort the Array
        sort(arr);
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++) {
            set.add(arr[i]);
        }
//        for(int i=0; i<arr.length-1; ){
//            if(arr[i] != arr[i+1]){
//                res++;
//            }else{
//                i++;
//            }
//        }
        return set.size();
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int res = solve(arr);
        System.out.println(res);
    }
}
