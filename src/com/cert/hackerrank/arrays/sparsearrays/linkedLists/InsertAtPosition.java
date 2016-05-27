package com.cert.hackerrank.arrays.sparsearrays.linkedLists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sridhar on 26/5/16.
 */
public class InsertAtPosition {

    public NodeElem insertAtPosition(NodeElem head,int data, int position) {
        NodeElem elem = new NodeElem();
        elem.data = data;

        if (head == null || position == 0){
            elem.next = head;
            return elem;
        }
        int ctr = 0;
        NodeElem headRet = head;
        NodeElem prev = null, curr = head;
        while (curr != null && ctr < position){
            prev = curr;
            curr = curr.next;
            ctr++;
        }

        elem.next = prev.next;
        prev.next = elem;

        return headRet;

    }


    public void printList(NodeElem head){
        NodeElem headRef = head;
        StringBuffer buffer = new StringBuffer();

        while (headRef != null){
            buffer.append(headRef.data + " ");
            headRef =  headRef.next;
        }
        System.out.println(buffer);
    }

    public static void main(String[] args) {
        InsertAtPosition inst = new InsertAtPosition();
        NodeElem head = inst.insertAtPosition(null, 5, 0);

        head = inst.insertAtPosition(head, 10, 1);
        inst.printList(head);
        head = inst.insertAtPosition(head, 100, 1);
        inst.printList(head);
    }
}
