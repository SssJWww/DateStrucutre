package com.stone.treeDemo;

import com.stone.Base.Node;
import com.stone.balanceTree.AVLTree;

public class AVLDemo {
    public static void main(String[] args) {
        int[] arr = {4,3,6,5,7,8};
        //create avlTree
        AVLTree avl = new AVLTree();
        for (int i=0; i<arr.length; i++) {
            avl.add(new Node(arr[i]));
        }
        avl.preOrder();
    }
}
