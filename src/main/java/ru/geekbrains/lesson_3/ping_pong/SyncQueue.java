package ru.geekbrains.lesson_3.ping_pong;

public class SyncQueue {
    boolean flag = true;
    synchronized void ping() {
        for (int i = 0; i < 10; i++) {
            while (!flag) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Ping");
            flag = false;
            notify();
        }
    }

    synchronized void pong() {
        for (int i = 0; i < 10; i++) {
            while (flag) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Pong");
            flag = true;
            notify();
        }
    }
}
