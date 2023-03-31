package ru.geekbrains.lesson_3.ping_pong;

public class Pong implements Runnable {
    SyncQueue q;

    public Pong(SyncQueue q) {
        this.q = q;
        new Thread(this, "Pong").start();
    }

    @Override
    public void run() {
        while (true) {
            q.pong();
        }
    }
}
