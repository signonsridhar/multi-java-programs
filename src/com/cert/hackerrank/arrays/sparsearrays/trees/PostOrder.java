package com.cert.hackerrank.arrays.sparsearrays.trees;

/**
 * Created by sridhar on 26/5/16.
 */
public class PostOrder {
    class Node {
        int data;
        Node left;
        Node right;
    }

    //Use recursion
    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
}
