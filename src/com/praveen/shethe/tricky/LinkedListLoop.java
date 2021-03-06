package com.praveen.shethe.tricky;

import java.util.HashSet;

/**
 * Created by Praveenkumar on 7/18/2020.
 */
public class LinkedListLoop {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    static public void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
        /* 3. Make next of new Node as head */
        new_node.next = head;
        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    static boolean detectLoop(Node h) {
        HashSet<Node> s = new HashSet<Node>();
        while (h != null) {
            // If we have already has this node
            // in hashmap it means their is a cycle
            // (Because you we encountering the
            // node second time).
            if (s.contains(h))
                return true;
            // If we are seeing the node for
            // the first time, insert it in hash
            s.add(h);
            h = h.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListLoop llist = new LinkedListLoop();

        push(20);
        push(4);
        push(15);
        push(10);
        /*Create loop for testing */
        head.next.next.next.next = head;
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(4);
//        head.next.next.next.next = new Node(5);
//        Create a loop for testing(5 is pointing to 3) /
//        head.next.next.next.next.next = head.next.next;

        if (detectLoop(head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");

        boolean found = detectLoop(head);
        if (found)
            System.out.println("Loop Found");
        else
            System.out.println("No Loop");
    }


}
