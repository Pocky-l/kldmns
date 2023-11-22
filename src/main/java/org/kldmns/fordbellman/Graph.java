package org.kldmns.fordbellman;

import java.util.ArrayList;
import java.util.List;
class Graph
{
    private int V;
    private List<Edge> edges;
    public Graph(int v)
    {
        V = v;
        edges = new ArrayList<Edge>();
    }
    public int getV()
    {
        return V;
    }
    public void setV(int v)
    {
        V = v;
    }
    public List<Edge> getEdges()
    {
        return edges;
    }
    public void setEdges(List<Edge> edges)
    {
        this.edges = edges;
    }
    public void addEdge(int u, int v, int w)
    {
        Edge e = new Edge(u, v, w);
        edges.add(e);
    }
}
