package com.company.Graph;

import java.util.*;

public class BFS {

    public void directedGraph(){
        int V = 5;
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(Arrays.asList(0,1));
        edges.add(Arrays.asList(0,2));
        edges.add(Arrays.asList(0,3));
        edges.add(Arrays.asList(2,4));

        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Boolean> visited = new HashMap<>();
        for(int i=0; i<V; i++){
            visited.put(i, false);
        }

        Map<Integer, List<Integer>> adjList = new HashMap<>();
        for(int i=0; i<edges.size(); i++){
            List<Integer> e = adjList.containsKey(edges.get(i).get(0)) ? adjList.get(edges.get(i).get(0)) : new ArrayList<>();
            e.add(edges.get(i).get(1));
            adjList.put(edges.get(i).get(0), e);
        }

        queue.add(0);
        visited.put(0, true);
        while(queue.size()>0){
            int pop = queue.remove();
            System.out.println(pop);
            List<Integer> childs = adjList.get(pop);
            if(childs!=null && childs.size()>0){
                for(int i=0; i<childs.size(); i++){
                    if(!visited.get(childs.get(i))){
                        queue.add(childs.get(i));
                        visited.put(childs.get(i), true);
                    }
                }
            }
        }
    }

}
