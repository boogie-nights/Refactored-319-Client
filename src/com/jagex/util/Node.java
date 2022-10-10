package com.jagex.util;

public class Node {

    public long id;
    public Node next;
    public Node previous;

    public void remove() {
        if (previous != null) {
            previous.next = next;
            next.previous = previous;
            next = null;
            previous = null;
        }
    }
}
