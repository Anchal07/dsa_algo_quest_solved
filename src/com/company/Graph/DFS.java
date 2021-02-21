package com.company.Graph;

import java.util.*;

public class DFS {

    public ArrayList<Integer> dfs(){

        int V=5;
        List<List<Integer>> adj = new ArrayList<>();
        adj.add(Arrays.asList(1,2,4));
        adj.add(new ArrayList<>());
        adj.add(new ArrayList<>());
        adj.add(new ArrayList<>());
        adj.add(Arrays.asList(3));

        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> dfs = new ArrayList<>();

        Map<Integer, Boolean> visited = new HashMap<>();
        for(int i=0; i<V; i++){
            visited.put(i, false);
        }

        for(int i=0; i<V; i++){
            dfsTraversal(i, adj, visited, dfs);
        }

        return dfs;
    }

    private void dfsTraversal(int i, List<List<Integer>> adj, Map<Integer, Boolean> isVisited, List<Integer> dfs){
        isVisited.put(i, true);
        dfs.add(i);
        List<Integer> c = adj.get(i);
        if(!c.isEmpty() && c.size()>0){
            for(int j=0; j<c.size(); j++){
                if(!isVisited.get(c.get(j)))
                    dfsTraversal(c.get(j), adj, isVisited, dfs);
            }
        }
    }

}
