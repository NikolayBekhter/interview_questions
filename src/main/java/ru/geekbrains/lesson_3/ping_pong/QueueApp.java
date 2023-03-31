package ru.geekbrains.lesson_3.ping_pong;

public class QueueApp {
    public static void main(String[] args) {
        SyncQueue q = new SyncQueue();
        new Ping(q);
        new Pong(q);
    }
}
