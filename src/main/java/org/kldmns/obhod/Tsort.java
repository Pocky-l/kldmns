package org.kldmns.obhod;

import java.util.Stack;

public class Tsort {
    private Stack<Vertex> stack;

    public Tsort() {
        this.stack = new Stack<>();
    }

    public void topologicalSort(Vertex startVertex) {
        resetVisitedFlags(startVertex);

        dfsTopologicalSort(startVertex);

        System.out.println("Topological Sort:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop().getName() + " ");
        }
    }

    private void resetVisitedFlags(Vertex startVertex) {
        if (startVertex != null) {
            startVertex.setVisited(false);
            for (Vertex neighbor : startVertex.getNeighbours()) {
                resetVisitedFlags(neighbor);
            }
        }
    }

    private void dfsTopologicalSort(Vertex vertex) {
        vertex.setVisited(true);

        for (Vertex neighbor : vertex.getNeighbours()) {
            if (!neighbor.isVisited()) {
                dfsTopologicalSort(neighbor);
            }
        }

        stack.push(vertex);
    }
}