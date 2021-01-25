package com.company;

import com.company.trees.Node;
import com.company.trees.VerticalOrderTraversalOfBinaryTree;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hi");
        new VerticalOrderTraversalOfBinaryTree().verticalTraversal(new Main().generateTree());
    }

    private Node generateTree(){
//        Node root = new Node(3);
//        root.setLeft(new Node(9));
//        root.setRight(new Node(20));
//        root.getRight().setLeft(new Node(15));
//        root.getRight().setRight(new Node(7));

        Node root = new Node(1);
        root.setLeft(new Node(2));
        root.setRight(new Node(3));
        root.getLeft().setLeft(new Node(4));
        root.getLeft().setRight(new Node(5));
        root.getRight().setLeft(new Node(6));
        root.getRight().setRight(new Node(7));

        return root;
    }
}
