package ru.geekbrains.lesson_3.ping_pong;

public class Ping implements Runnable {
    SyncQueue q;

    public Ping(SyncQueue q) {
        this.q = q;
        new Thread(this, "Ping").start();
    }

    @Override
    public void run() {
        q.ping();
    }
}
