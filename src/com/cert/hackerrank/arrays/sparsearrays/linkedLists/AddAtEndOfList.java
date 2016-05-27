package com.cert.hackerrank.arrays.sparsearrays.linkedLists;

/**
 * Created by sridhar on 26/5/16.
 * 
 */
public class AddAtEndOfList {

    class NodeElem{
        int data;
        NodeElem next;

        @Override
        public String toString(){
            return String.valueOf(this.data);
        }
    }
    public NodeElem insert(NodeElem head,int data) {
        NodeElem headRef = head;
        NodeElem node = new NodeElem();
        node.data = data;
        node.next = null;

        if (head == null){
            headRef = node;
            return headRef;
        }

        while ((head.next != null)) {
            head = head.next;
        }
        head.next = node;
        return headRef;

    }


    public void printList(NodeElem head){
        NodeElem headRef = head;
        while (headRef != null){
            System.out.println(headRef.data);
            headRef =  headRef.next;
        }
    }

    public static void main(String[] args) {
        AddAtEndOfList inst = new AddAtEndOfList();
        NodeElem head = inst.insert(null, 5);

        head = inst.insert(head, 10);
        head = inst.insert(head, 10);
        inst.printList(head);
    }

}
