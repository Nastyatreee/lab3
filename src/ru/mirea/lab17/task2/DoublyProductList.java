package ru.mirea.lab17.task2;

public class DoublyProductList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyProductList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(Product p) {
        Node node = new Node(p);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    public boolean remove(int number) {
        if (number < 1 || number > size) {
            return false;
        }
        Node cur = head;
        for (int i = 1; i < number; i++) {
            cur = cur.next;
        }
        if (cur.prev != null) {
            cur.prev.next = cur.next;
        } else {
            head = cur.next;
        }
        if (cur.next != null) {
            cur.next.prev = cur.prev;
        } else {
            tail = cur.prev;
        }
        size--;
        return true;
    }

    public void printElement(int number) {
        if (number < 1 || number > size) {
            System.out.println("Товара с таким номером нет");
            return;
        }
        Node cur = head;
        for (int i = 1; i < number; i++) {
            cur = cur.next;
        }
        cur.data.print();
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Склад пуст");
            return;
        }
        Node cur = head;
        int i = 1;
        while (cur != null) {
            System.out.print(i + ". ");
            cur.data.print();
            cur = cur.next;
            i++;
        }
    }

    public void printBackward() {
        if (isEmpty()) {
            System.out.println("Склад пуст");
            return;
        }
        Node cur = tail;
        int i = size;
        while (cur != null) {
            System.out.print(i + ". ");
            cur.data.print();
            cur = cur.prev;
            i--;
        }
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
