package com.cert.datastruct;

/**
 * Created by sridhar on 10/5/16. BINAR){Y TREE
 *                    6
 *                 4     10
 *               3   5  8    12
 */
public class SimpleTree<E extends Comparable> {
    private E value;

    SimpleTree<E> left;
    SimpleTree<E> right;

    public SimpleTree(E toInsert, SimpleTree<E> left, SimpleTree<E> right){
        value = toInsert;
        this.left = left;
        this.right = right;
    }

    public void insert(final E toInsert) {
        if (toInsert.compareTo(value) < 0){
            if (left ==null)
                left = new SimpleTree<>(toInsert, null, null);
            else
                left.insert(toInsert);
        } else {
            if (right ==null)
                right = new SimpleTree<>(toInsert, null, null);
            else
                right.insert(toInsert);
        }
    }

    public boolean search(final E toFind) {
        if (toFind.equals(value)){
            return true;
        }
        if (toFind.compareTo(value) < 0 && left != null){
            return left .search(toFind);
        }
        return right != null && right.search(toFind);

    }

    public static void main(String[] args) {
        //SimpleTree<>
    }
}
