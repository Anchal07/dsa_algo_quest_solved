package com.company.trees;

/*
Source : Leetcode
Link : https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/
Difficulty : Medium
 */

import java.util.*;

public class VerticalOrderTraversalOfBinaryTree {

    public List<List<Integer>> verticalTraversal(Node root){

        List<List<Integer>> result = new LinkedList<>();
        Map<Integer, LinkedList<Integer>> hd = new TreeMap<>();
        traversal(hd, root, 0);
        hd.entrySet().stream().forEach(v->result.add(v.getValue()));
        return result;
    }

    private void traversal(Map<Integer, LinkedList<Integer>> hd, Node node, int prevHd){
        if(node==null)
            return;
        if(hd.containsKey(prevHd) && !hd.get(prevHd).contains(node.getData())){
            LinkedList<Integer> list = hd.get(prevHd);
            list.add(node.getData());
            hd.put(prevHd, hd.get(prevHd));
        }
        else{
            hd.put(prevHd, new LinkedList<>(Arrays.asList(node.getData())));
        }
        traversal(hd, node.getLeft(), prevHd-1);
        traversal(hd, node.getRight(), prevHd+1);
    }

}