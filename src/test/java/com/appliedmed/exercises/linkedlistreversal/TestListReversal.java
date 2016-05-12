package com.appliedmed.exercises.linkedlistreversal;

import java.util.Random;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestListReversal {
    @Test
    public void testRandomList() {
        final Random random = new Random();
                
        Node tail = new Node(null, random.nextInt(10));
        Node head = tail;
        String reverse = Integer.toString(tail.value);
        
        for(int i = 0; i < 10; i++) {
            final int value = random.nextInt(10);
            
            head = new Node(head, value);
            reverse += value;
        }
        
        assertEquals(reverse, LinkedListReverse.reverse(head).toString());
    }
    
    @Test
    public void testReversal() {
        Node tail = new Node(null, 5);
        
        Node head = tail;
        for(int i = 4; i >= 0; i--) {
            head = new Node(head, i);
        }
        
        assertEquals("012345", head.toString());
        assertEquals("543210", LinkedListReverse.reverse(head).toString());
    }
}
