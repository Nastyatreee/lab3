package ru.mirea.lab17.task1;

import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    private int count;

    public void read(Scanner sc) {
        System.out.print("Название товара: ");
        name = sc.nextLine();
        System.out.print("Цена: ");
        price = Double.parseDouble(sc.nextLine());
        System.out.print("Количество на складе: ");
        count = Integer.parseInt(sc.nextLine());
    }

    public void print() {
        System.out.println(name + " - " + price + " руб., " + count + " шт.");
    }
}
