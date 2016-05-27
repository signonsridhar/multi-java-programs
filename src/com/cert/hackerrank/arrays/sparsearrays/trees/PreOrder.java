package com.cert.hackerrank.arrays.sparsearrays.trees;

/**
 * Created by sridhar on 26/5/16.
 */
public class PreOrder {
    class Node {
        int data;
        Node left;
        Node right;
    }

    //Use recursion
    void preOrder(Node root) {
            if (root != null) {
                System.out.print(root.data + " ");

                preOrder(root.left);
                preOrder(root.right);
            }
    }
}
