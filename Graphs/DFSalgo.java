package Graphs;

import java.util.Arrays;
import java.util.Scanner;

public class DFSalgo {
    public static void dfs(int [][]adjMatrix, int currentVertex, boolean []visited){
        visited[currentVertex] = true;
        System.out.print(currentVertex + " ");
        for(int i=0; i< adjMatrix.length; i++){
            if(adjMatrix[currentVertex][i]== 1 && !visited[i]){
                dfs(adjMatrix, i, visited);
            }
        }
    }

    public static void dfs(int [][]adjMatrix, int source){
        boolean []visited = new boolean[adjMatrix.length];
        dfs(adjMatrix, source, visited);
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Vertices: ");
        int n = sc.nextInt();
        System.out.print("Enter Number of Edges: ");
        int e = sc.nextInt();
        int [][]adjMatrix = new int[n][n];
        for(int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }

        // Display the graph
        System.out.println("Graph is: ");
        for(int []arr : adjMatrix){
            System.out.println(Arrays.toString(arr));
        }

        dfs(adjMatrix, 0);
    }
}
