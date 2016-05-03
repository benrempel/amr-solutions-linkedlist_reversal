package com.appliedmed.exercises.linkedlistreversal;

public class Node {

    /**
     * The next node in the linked list. null specifies the tail.
     */
    Node next;
    int value;

    public Node(Node next, int value) {
        this.next = next;
        this.value = value;
    }

    @Override
    public String toString() {
        if (next != null) {
            return value + next.toString();
        } else {
            return Integer.toString(value);
        }
    }
}
