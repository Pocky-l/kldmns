package org.kldmns.fordbellman;

import java.util.Arrays;
import java.util.List;

public class FordBellman {

    public static void main(String[] args) {
        Graph graph = createGraph();
        int source = 0;
        int[] distances = bellmanFord(graph, source);

        System.out.println("Shortest distances from source " + source + ":");
        printDistances(distances);
    }

    private static Graph createGraph() {
        Graph graph = new Graph(8);
        graph.addEdge(0, 1, 5);
        graph.addEdge(0, 4, 9);
        graph.addEdge(0, 7, 8);
        graph.addEdge(1, 2, 12);
        graph.addEdge(1, 3, 15);
        graph.addEdge(1, 7, 4);
        graph.addEdge(2, 3, 3);
        graph.addEdge(2, 6, 11);
        graph.addEdge(3, 6, 9);
        graph.addEdge(4, 5, 4);
        graph.addEdge(4, 6, 20);
        graph.addEdge(4, 7, 5);
        graph.addEdge(5, 2, 1);
        graph.addEdge(5, 6, 13);
        graph.addEdge(7, 2, 7);
        graph.addEdge(7, 5, 6);
        return graph;
    }

    private static void printDistances(int[] distances) {
        for (int i = 0; i < distances.length; i++) {
            System.out.println("To " + i + ": " + distances[i]);
        }
    }

    public static int[] bellmanFord(Graph graph, int source) {
        int V = graph.getV();
        int[] distances = initializeDistances(V, source);

        List<Edge> edges = graph.getEdges();

        relaxEdges(V, distances, edges);

        checkNegativeCycles(distances, edges);

        return distances;
    }

    private static int[] initializeDistances(int V, int source) {
        int[] distances = new int[V];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;
        return distances;
    }

    private static void relaxEdges(int V, int[] distances, List<Edge> edges) {
        for (int i = 1; i < V; i++) {
            for (Edge edge : edges) {
                int u = edge.getU();
                int v = edge.getV();
                int weight = edge.getW();

                if (distances[u] != Integer.MAX_VALUE && distances[u] + weight < distances[v]) {
                    distances[v] = distances[u] + weight;
                }
            }
        }
    }

    private static void checkNegativeCycles(int[] distances, List<Edge> edges) {
        for (Edge edge : edges) {
            int u = edge.getU();
            int v = edge.getV();
            int weight = edge.getW();

            if (distances[u] != Integer.MAX_VALUE && distances[u] + weight < distances[v]) {
                System.out.println("Graph contains negative weight cycle");
            }
        }
    }
}