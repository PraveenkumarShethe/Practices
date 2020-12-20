package com.praveen.shethe.programming;

import com.praveen.shethe.tricky.LinkedListLoop;
import org.w3c.dom.Node;

import java.util.HashSet;

/**
 * Created by Praveenkumar on 12/17/2020.
 */
public class LinkedListloopDetection {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static boolean detectLoop(Node head) {
        HashSet<Node> nodeHashSet = new HashSet<>();
        while (nodeHashSet != null) {
            if (nodeHashSet.contains(head)){
                System.out.println("loop present");
                return true;
            }
            nodeHashSet.add(head);
            head = head.next;
        }
        return false;
    }

    static public void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        LinkedListloopDetection.Node new_node = new LinkedListloopDetection.Node(new_data);
        /* 3. Make next of new Node as head */
        new_node.next = head;
        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    public static void main(String[] args) {
        LinkedListloopDetection listloopDetection = new LinkedListloopDetection();
        push(1);
        push(3);
        push(4);
        push(2);
        push(6);
        push(7);
        push(8);
        push(9);
        head.next.next.next.next = head;
        detectLoop(head);
    }
}
