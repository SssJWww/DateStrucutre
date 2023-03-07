package com.stone.Base;

public class Node {
    public int value;
    public Node left;
    public Node right;

    public Node() {
    }

    public Node(int value) {
        this.value = value;
    }

    //return current node tree height
    public int height() {
        return Math.max(left == null ? 0 : left.height(),
                right == null? 0 : right.height()) + 1;
    }

    //return left tree height
    public int leftHeight() {
        if(left == null) {
            return 0;
        }
        return left.height();
    }

    //return right tree height
    public int rightHeight() {
        if (right == null) {
            return 0;
        }
        return right.height();
    }

    public void add(Node node) {
        if (node.value < this.value) {
            if (this.left == null) {
                this.left = node;
            } else {
                this.left.add(node);
            }
        }

        if (node.value > this.value) {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.add(node);
            }
        }
    }

    public void preOrder() {
        System.out.println(this);
        if (this.left != null) {
            this.left.preOrder();
        }
        if (this.right != null) {
            this.right.preOrder();
        }
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

}
