package org.diego;

class SList {
    public final Node front; public SList() {
        this.front = new Node(null, null);
    }

    public void prepend(String s) {
        Node n = new Node(s, front.next);
        front.next = n;
    }

    public void removeLast() {
        Node current = this.front;
        while(current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public String getLast() {
        Node current = this.front;
        while(current.next != null) {
            current = current.next;
        }
        return current.s;
    }

    public void replace(String old, String s) {
        Node current = this.front;
        while(current.next != null) {
            if (old.equals(current.next.s)) {
                current.next.s = s;
            }
            current.next = current.next.next;
        }
    }
}