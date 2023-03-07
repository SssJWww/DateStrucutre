package com.stone.balanceTree;

import com.stone.Base.Node;

public class AVLTree {
    private Node root;

    public AVLTree() {
    }

    public AVLTree(Node root) {
        this.root = root;
    }

    public void add(Node node) {
        if (root == null) {
            root = node;
        } else {
            root.add(node);
        }
    }

    public Node getRoot() {
        return root;
    }

    public void preOrder() {
        if (root != null) {
            root.preOrder();
        } else {
            System.out.println("current tree is empty");
        }
    }
}
