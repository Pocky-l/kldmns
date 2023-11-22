package org.kldmns.fordbellman;

public class FordBellman
{
    public static void main(String args[])
    {
        Graph g = createGraph();
        int distance[] = new int[g.getV()];
        boolean hasNegativeCycle = getShortestPaths(g, 1, distance);
        if(!hasNegativeCycle)
        {
            System.out.println("Vertex \t: Distance");
            for(int i = 1; i < distance.length; i++)
                System.out.println("\t"+i + " " + "\t\t"+(distance[i] == Integer.MAX_VALUE ? "-" : distance[i]));
        }
        else
        {
            System.out.println("Negative cycle exists in the graph, no solution found!!!");
        }
    }
    private static Graph createGraph()
    {
        int v = 9;
//creating a graph having 7 s
        Graph g = new Graph(v);
//adding edges to the graph
        g.addEdge(1, 2, 5);
        g.addEdge(2, 6, 2);
        g.addEdge(2, 4, -3);
        g.addEdge(4, 3, 7);
        g.addEdge(4, 9, -3);
        g.addEdge(9, 5, 1);
        g.addEdge(3, 7, -5);
        g.addEdge(7, 8, 2);
        g.addEdge(8, 3, 4);
//returns graph
        return g;
    }
    //Bellman-Ford logic
    public static boolean getShortestPaths(Graph g, int source, int[] distance)
    {
        int V = g.getV();
//initializing distances from source to other vertices
        for(int i = 1; i < V; i++)
        {
            distance[i] = Integer.MAX_VALUE;
        }
//source vertex initialize to 0
        distance[source] = 0;
//relaxing edges
        for(int i = 1; i < V; i++)
        {
//iterate over edges
            for(Edge e: g.getEdges())
            {
                int u = e.getU(), v = e.getV(), w = e.getW();
                System.out.println(u);
                System.out.println(w);
                System.out.println(v);
                System.out.println(" ");
                System.out.println(distance.length);
                if(distance.length < u && distance.length < v) return false;
                if(distance[u - 1] != Integer.MAX_VALUE && distance[v - 1] > distance[u] + w)
                {
//calculates distance
                    distance[v] = distance[u] + w;
                }
            }
        }
//checks if there exist negative cycles in graph G
        for(Edge e: g.getEdges())
        {
            int u = e.getU(), v = e.getV(), w = e.getW();
            if(distance[u] != Integer.MAX_VALUE && distance[v] > distance[u] + w)
            {
                return true;
            }
        }
        return false;
    }
}
