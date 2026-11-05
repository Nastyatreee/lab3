package ru.mirea.lab9;

public class Task3 {
    public static void main(String[] args) {
        Student[] list1 = {
                new Student(214, "Белова", 4.4),
                new Student(108, "Котова", 3.7),
                new Student(305, "Лебедева", 4.9)
        };
        Student[] list2 = {
                new Student(271, "Зайцева", 4.0),
                new Student(156, "Морозова", 4.6)
        };

        list1 = MergeSort.sort(list1);
        list2 = MergeSort.sort(list2);

        System.out.println("Первый список после сортировки:");
        for (Student s : list1) {
            System.out.println(s);
        }
        System.out.println("Второй список после сортировки:");
        for (Student s : list2) {
            System.out.println(s);
        }

        Student[] all = MergeSort.merge(list1, list2);

        System.out.println("Объединённый отсортированный список:");
        for (Student s : all) {
            System.out.println(s);
        }
    }
}
