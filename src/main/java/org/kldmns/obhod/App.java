package org.kldmns.obhod;

public class App {
    public static void main(String[] args) {
        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");
        Vertex E = new Vertex("E");
        Vertex F = new Vertex("F");
        Vertex G = new Vertex("G");
        Vertex H = new Vertex("H");

        A.addNeighbour(B);
        A.addNeighbour(F);
        A.addNeighbour(G);

        B.addNeighbour(C);
        B.addNeighbour(D);

        D.addNeighbour(E);

        G.addNeighbour(H);

        //BFS bfs = new BFS(A);
        //bfs.bfs();


        DFS dfs = new DFS(A);
        dfs.dfs();

        Tsort sort = new Tsort();
        sort.topologicalSort(A);


    }
}