package com.cert.hackerrank.arrays.sparsearrays.linkedLists;

public class AddToBeginning {

    class Node{
        int data;
        Node next;

        @Override
        public String toString(){
            return String.valueOf(this.data);
        }
    }
    public Node insert(Node head,int data) {

        Node node = new Node();
        node.data = data;
        node.next = head;

        return node;

    }


    public void printList(Node head){
        Node headRef = head;
        while (headRef != null){
            System.out.println(headRef.data);
            headRef =  headRef.next;
        }
    }

    public static void main(String[] args) {
        AddToBeginning inst = new AddToBeginning();
        Node head = inst.insert(null, 5);

        head = inst.insert(head, 10);
        head = inst.insert(head, 10);
        inst.printList(head);
    }

}
