package ru.mirea.lab17.task3;

public class CircularProductList {
    private Node head;
    private Node tail;
    private int size;

    public CircularProductList() {
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
            tail.next = node;
            tail = node;
        }
        tail.next = head;
        size++;
    }

    public boolean remove(int number) {
        if (number < 1 || number > size) {
            return false;
        }
        if (size == 1) {
            clear();
            return true;
        }
        Node prev = tail;
        for (int i = 1; i < number; i++) {
            prev = prev.next;
        }
        Node cur = prev.next;
        prev.next = cur.next;
        if (cur == head) {
            head = cur.next;
        }
        if (cur == tail) {
            tail = prev;
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
        for (int i = 1; i <= size; i++) {
            System.out.print(i + ". ");
            cur.data.print();
            cur = cur.next;
        }
    }

    public void rotate() {
        if (isEmpty()) {
            return;
        }
        head = head.next;
        tail = tail.next;
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
