package com.appliedmed.exercises.linkedlistreversal;

public class LinkedListReverse {

    /**
     * Reverses the input Linked List. This method is allowed to return either a
     * new Linked List or the modified input Linked List.
     *
     * @param list the Linked List.
     * @return The contents of the input, reversed.
     */
    public static Node reverse(Node list) {
	if (list.next==null) {
	    return list;
	}
	Node head = reverse(list.next);
	list.next.next = list;
	list.next = null;
        return head;
    }
}
