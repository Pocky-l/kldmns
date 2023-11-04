package org.kldmns.obhod;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    Vertex start;

    public BFS(Vertex start){
        this.start = start;
    }

    public void bfs(){
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()){
            Vertex curr = queue.poll();
            for (Vertex v : curr.getNeighbours()){
                if (!v.isVisited())
                    queue.add(v);
            }
            curr.setVisited(true);
            System.out.println(curr.getName());
        }
    }
}