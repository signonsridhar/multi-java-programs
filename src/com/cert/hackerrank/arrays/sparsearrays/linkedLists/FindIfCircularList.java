package com.cert.hackerrank.arrays.sparsearrays.linkedLists;

//http://www.programmerinterview.com/index.php/data-structures/how-to-find-if-a-linked-list-is-circular-or-has-a-cycle-or-it-ends/
/**
 * Created by sridhar on 26/5/16.
 */
public class FindIfCircularList {
    class Node{
        int data;
        Node next;
    }

    boolean findCircular(Node head) {
        Node  slower, faster;
        slower = head;
        faster = head.next; //start faster one node ahead
        while (true) {

            // if the faster pointer encounters a NULL element
            if (faster == null || faster.next == null)
                return false;
                //if faster pointer ever equals slower or faster's next
                //pointer is ever equal to slow then it's a circular list
            else if (faster == slower || faster.next == slower)
                return true;
            else {
                // advance the pointers
                slower = slower.next;
                faster = faster.next.next;
            }
        }
    }
}