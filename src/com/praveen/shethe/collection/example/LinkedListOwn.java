package com.praveen.shethe.collection.example;

import java.util.HashSet;

/**
 * Created by Praveenkumar on 11/4/2020.
 */
public class LinkedListOwn {

    static Node head; // head of list

    /* Linked list Node*/
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
        HashSet<Node> nodeHashSet = new HashSet<Node>();
        while (h != null) {
            // If we have already has this node
            // in hashmap it means their is a cycle
            // (Because you we encountering the
            // node second time).
            if (nodeHashSet.contains(h))
                return true;
            // If we are seeing the node for
            // the first time, insert it in hash
            nodeHashSet.add(h);
            h = h.next;
        }

        return false;
    }
}

class LinkedListTesting{

    public static void main(String[] args) {
        LinkedListOwn llist = new LinkedListOwn();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        /*Create loop for testing */
        llist.head.next.next.next = llist.head;

        if (llist.detectLoop(llist.head))
            System.out.println("Linkedlist Loop found");
        else
            System.out.println("No Loop");
    }
}