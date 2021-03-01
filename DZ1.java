package ru.geekbrains.homework4;

public class DZ1 {
    private static final Object mon = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (mon) {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.print("A");
                        mon.wait();
                        mon.notify();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (mon) {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.print("B");
                        mon.wait();
                        mon.notify();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (mon) {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.print("C");
                        mon.notify();
                        mon.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
