package org.kldmns.obhod;

import java.util.Stack;

public class DFS {
    Vertex start;

    public DFS(Vertex start){
        this.start = start;
    }

    public void dfs(){
        Stack<Vertex> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()){
            Vertex curr = stack.pop();

            for (Vertex v : curr.getNeighbours())
                if (!v.isVisited())
                    stack.push(v);

            curr.setVisited(true);
            System.out.println(curr.getName());
        }
    }
}