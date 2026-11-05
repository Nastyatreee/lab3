package ru.mirea.lab9;

public class Student implements Comparable<Student> {
    private int iDNumber;
    private String surname;
    private double finalScore;

    public Student(int iDNumber, String surname, double finalScore) {
        this.iDNumber = iDNumber;
        this.surname = surname;
        this.finalScore = finalScore;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public String getSurname() {
        return surname;
    }

    public double getFinalScore() {
        return finalScore;
    }

    @Override
    public int compareTo(Student other) {
        if (this.iDNumber < other.iDNumber) {
            return -1;
        } else if (this.iDNumber > other.iDNumber) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "№" + iDNumber + " " + surname + " (балл " + finalScore + ")";
    }
}
