package Graphs;

// breadth first search of graph.java
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    // Adjacency matrix
    int[][] adjMatrix;
    // Number of vertices
    int vertices;
    // Constructor
    public bfs(int vertices){
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices];
    }
    // Add edge
    public void addEdge(int src, int dest){
        adjMatrix[src][dest] = 1;
        adjMatrix[dest][src] = 1;
    }
    // Remove edge
    public void removeEdge(int src, int dest){
        adjMatrix[src][dest] = 0;
        adjMatrix[dest][src] = 0;
    }
    // Print graph
    public void printGraph(){
        for(int i = 0; i < vertices; i++){
            System.out.print(i + ": ");
            for(int j = 0; j < vertices; j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    // Breadth first search
    public void bfs(int start){
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.print(node + " ");
            for(int i = 0; i < vertices; i++){
                if(adjMatrix[node][i] == 1 && !visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    // Main method
    public static void main(String[] args) {
        bfs obj = new bfs(5);
        obj.addEdge(0, 1);
        obj.addEdge(0, 4);
        obj.addEdge(1, 2);
        obj.addEdge(1, 3);
        obj.addEdge(1, 4);
        obj.addEdge(2, 3);
        obj.addEdge(3, 4);
        obj.printGraph();
        obj.bfs(0);
    }
}
