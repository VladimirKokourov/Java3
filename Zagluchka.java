package ru.geekbrains.java3.lesson1;

public class Test {
    public static void main(String[] args) {
        int i1 = 1000;
        int i2 = 1000;
        System.out.println(i1 == i2);

        Integer integer1 = 1000;
        Integer integer2 = 1000;
        System.out.println(integer1.equals(integer2));
        System.out.println(integer1 == integer2);
    }
}