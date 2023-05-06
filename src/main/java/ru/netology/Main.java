package ru.netology;

public class Main {
    public static void main(String[] args) {
        System.out.println("JDCP-6, Евгений Орлов, ДЗ-33: " +
                "\"Поведенческие шаблоны. Command, Iterator, Observer, Chain of Responsibility\"");
        System.out.println("Задача №1. “Бесконечная итерация” (обязательная)\n");

        for (int r : new Randoms(90, 100)) {
            System.out.println("Случайное число: " + r);
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}