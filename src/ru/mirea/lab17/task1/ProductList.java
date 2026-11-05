package ru.mirea.lab17.task1;

public class ProductList {
    private Node head;
    private int size;

    public ProductList() {
        head = null;
        size = 0;
    }

    public void add(Product p) {
        Node node = new Node(p);
        node.next = head;
        head = node;
        size++;
    }

    public boolean remove(int number) {
        if (number < 1 || number > size) {
            return false;
        }
        if (number == 1) {
            head = head.next;
        } else {
            Node prev = head;
            for (int i = 1; i < number - 1; i++) {
                prev = prev.next;
            }
            prev.next = prev.next.next;
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

    public void clear() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
