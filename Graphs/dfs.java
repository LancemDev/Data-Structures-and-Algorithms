package Graphs;

// depth first search of graph.java
public class dfs {
    // Adjacency matrix
    int[][] adjMatrix;
    // Number of vertices
    int vertices;
    // Constructor
    public dfs(int vertices){
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
    // Depth first search
    public void dfs(int start){
        boolean[] visited = new boolean[vertices];
        dfsUtil(start, visited);
    }
    // Depth first search utility
    public void dfsUtil(int start, boolean[] visited){
        visited[start] = true;
        System.out.print(start + " ");
        for(int i = 0; i < vertices; i++){
            if(adjMatrix[start][i] == 1 && !visited[i]){
                dfsUtil(i, visited);
            }
        }
    }
    // Main method
    public static void main(String[] args) {
        dfs obj = new dfs(5);
        obj.addEdge(0, 1);
        obj.addEdge(0, 4);
        obj.addEdge(1, 2);
        obj.addEdge(1, 3);
        obj.addEdge(1, 4);
        obj.addEdge(2, 3);
        obj.addEdge(3, 4);
        obj.printGraph();
        obj.dfs(0);
    }
}
