package ru.mirea.lab17.task2;

public class Node {
    Product data;
    Node prev;
    Node next;

    public Node(Product data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
