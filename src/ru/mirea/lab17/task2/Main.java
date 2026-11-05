package ru.mirea.lab17.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyProductList store = new DoublyProductList();
        boolean work = true;

        while (work) {
            System.out.println();
            System.out.println("1 - добавить товар");
            System.out.println("2 - удалить товар по номеру");
            System.out.println("3 - показать товар по номеру");
            System.out.println("4 - показать все товары");
            System.out.println("5 - очистить склад");
            System.out.println("6 - проверить, пуст ли склад");
            System.out.println("7 - показать товары с конца");
            System.out.println("0 - выход");
            System.out.print("Выберите пункт: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    Product p = new Product();
                    p.read(sc);
                    store.add(p);
                    break;
                case 2:
                    System.out.print("Номер товара: ");
                    if (store.remove(Integer.parseInt(sc.nextLine()))) {
                        System.out.println("Товар удалён");
                    } else {
                        System.out.println("Товара с таким номером нет");
                    }
                    break;
                case 3:
                    System.out.print("Номер товара: ");
                    store.printElement(Integer.parseInt(sc.nextLine()));
                    break;
                case 4:
                    store.printAll();
                    break;
                case 5:
                    store.clear();
                    System.out.println("Склад очищен");
                    break;
                case 6:
                    System.out.println(store.isEmpty() ? "Склад пуст" : "На складе есть товары");
                    break;
                case 7:
                    store.printBackward();
                    break;
                case 0:
                    work = false;
                    break;
                default:
                    System.out.println("Нет такого пункта");
            }
        }
    }
}
