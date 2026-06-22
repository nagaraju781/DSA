package Graphs;

import java.util.Scanner;

public class Adj_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Number of vertices
        int m = sc.nextInt(); // Number of edges

        int[][] adjMatrix = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjMatrix[u][v] = 1; // Mark the edge in the adjacency matrix
            adjMatrix[v][u] = 1; // Since the graph is undirected
        }

        // Print the adjacency matrix
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}